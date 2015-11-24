import java.util.ArrayList;
import java.util.Date;




public class Tarjeta {
	
	private double saldo;
	private boolean trasbordo = true;
	private long horaActual;
	private ArrayList <Viaje> viajes;
	private boolean medioBoleto;
	
	public Tarjeta (boolean medioBoleto){
		this.medioBoleto = medioBoleto;
		viajes = new ArrayList<Viaje>();
	}
	
	public boolean pagarBoleto (Colectivo col, Date fecha){
		horaActual = System.currentTimeMillis();
		if (viajes != null && (viajes.size() > 0)){
			if ((viajes.get(viajes.size()-1).getColectivo().getLinea() != col.getLinea()) && 
					(horaActual - viajes.get(viajes.size()-1).getFecha().getTime() )< 60*60*1000) {
				if (trasbordo) {
					if (medioBoleto) {
						if (saldo >= 0.96) {
							saldo = saldo - 0.96;
							Viaje v = new Viaje (col, fecha, 0.96);
							viajes.add(v);
							trasbordo = false;
							return true;
						}
					}else if (saldo >= 1.90) {
						saldo = saldo - 1.90;
						Viaje v = new Viaje (col, fecha, 1.90);
						viajes.add(v);
						trasbordo = false;
						return true;
					}
				}
			}
		}			
		if (medioBoleto) {
			if (saldo >= 2.90) {
				saldo = saldo - 2.90;
				Viaje v = new Viaje (col, fecha, 2.90);
				viajes.add(v);
				trasbordo = true;
				return true;
			}
		}else if (saldo >= 5.75) {
			saldo = saldo - 5.75;
			Viaje v = new Viaje (col, fecha, 5.75);
			viajes.add(v);
			trasbordo = true;
			return true;
		}
		
		return false;
	}	
	public double saldo (){
		return saldo;
	}
	
	public void recarga (double monto){
		 if (monto >= 368){
             saldo += monto + 92;
         }else if (monto >= 196){ 
             saldo += monto + 34;
         }else{
             saldo += monto;    
         }
	}
	
	public String viajesRealizados(){
		String lista = "";
		for (int i = 0; i < viajes.size(); i++) {
			lista = lista + viajes.get(i).getColectivo().getLinea() + " " +  viajes.get(i).getFecha() + " " + viajes.get(i).getMonto() + "\n";
		}
		return lista;
		
	}

	public ArrayList<Viaje> getViajes() {
		return viajes;
	}
	
}

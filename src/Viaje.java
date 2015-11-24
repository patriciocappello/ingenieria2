import java.util.Date;


public class Viaje {
	
	private Colectivo colectivo;
	private Date fecha;
	private double monto;
	
	public Viaje (Colectivo col, Date fecha, double monto){
		this.colectivo = col;
		this.fecha = fecha;
		this.monto = monto;
	}

	public Colectivo getColectivo() {
		return colectivo;
	}

	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
}

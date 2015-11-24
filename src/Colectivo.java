


public class Colectivo {
	
	
	private String linea;
	private String empresa;
	private int numeroInterno;
	
	public Colectivo (String linea, String empresa, int numeroInterno){
		this.linea = linea;
		this.empresa = empresa;
		this.numeroInterno = numeroInterno;
		
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroInterno() {
		return numeroInterno;
	}

	public void setNumeroInterno(int numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	
	
}	

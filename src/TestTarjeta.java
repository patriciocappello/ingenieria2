


import static org.junit.Assert.*;


import java.util.Date;

import org.junit.Test;




public class TestTarjeta {
	
	Date fecha = new Date ();
	Tarjeta t = new Tarjeta(true);
	Colectivo c = new Colectivo("142", "Mixta", 2);
	
	
	@Test
	public void SinSaldo (){
		assertEquals(0.0, t.saldo(),0);

	
	}
	
	@Test
	public void recargar (){
		t.recarga(10);
		assertEquals(10, t.saldo(),0);
	
		
	}
	
	@Test
	public void pagar (){
		t.recarga(10);
		assertEquals(10, t.saldo(),0);
		assertTrue(t.pagarBoleto(c, fecha));
	}


}

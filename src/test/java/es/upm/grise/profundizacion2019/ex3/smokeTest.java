package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.mock;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class smokeTest {
	
	Time hora1;
	MyClass my;
	//@Mock
	//Time hora;
	
	@Before
	public void setUp() {
		my = new MyClass();
	}

	/*@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);

	}*/
	
	//Devuelve la fecha actual
		@Test
		public void fechaAhora() {
			my =new MyClass(hora1);
			long SECONDS = 0;
			my.nextTime(SECONDS);
		}
	//Da la fecha con 120 segundos más
		@Test
		public void fechaTras120Segundos() {
			my=new MyClass(hora1);
			long SECONDS = 120;
			my.nextTime(SECONDS);
		}
		
	//Solo llama una vez al metodo 
		@Test
		public void soloLlamaUnaVezGetFutureTime() {
			Time hora2 = mock(Time.class);
			long SECONDS = 120;
	 		my.nextTime(SECONDS);
	 		verify(hora2, atLeastOnce()).getFutureTime(SECONDS);
	 		//verify(hora2, times(1)).getFutureTime(SECONDS);
			
		}
}

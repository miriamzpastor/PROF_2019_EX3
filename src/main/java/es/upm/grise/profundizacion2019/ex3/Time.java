package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	//Se ponen protected y se establece formato
	protected static DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	//Se ponen protected
	protected static String getFutureTime(long seconds) {
		//Se inicializa Time y se pone protected
		LocalDateTime time= LocalDateTime.of(2020, 01, 01, 00,00, 00);
		time = time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}

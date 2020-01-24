package es.upm.grise.profundizacion2019.ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	protected static DateTimeFormatter formatter;
	protected static LocalDateTime time;
	
	protected static String getFutureTime(long seconds) {
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		//Se inicializa Time
		LocalDateTime time = LocalDateTime.of(2020, 01, 01, 00,00, 00);
	    time = LocalDateTime.now();
		time.plusSeconds(seconds);
		return formatter.format(time);	
	}

}

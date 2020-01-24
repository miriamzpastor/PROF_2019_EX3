package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
	//Se pone como protected
    protected static Time hora=new Time();
    
	//Constructor vacio
	public MyClass() {
		}
	
	//Constructor
	public MyClass(Time hora) {
		this.hora= hora;
	}
	
	
	public void nextTime(long seconds) {
		String next = Time.getFutureTime(seconds);
		System.out.println(next);
	}

}

package es.upm.grise.profundizacion2019.ex3;

public class MyClass {
	
    private Time hora=new Time();
	
	public MyClass() {
		}
	
	public void nextTime(long seconds) {
		String next = Time.getFutureTime(seconds);
		System.out.println(next);
	}

}

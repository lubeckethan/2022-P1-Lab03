// Lab03vst.java
// Student starting version of the Lab03 assignment.
// Resave this program as Lab03v80 for the 80 point version.
// Resave this program as Lab03v100 for the 100 point version.


public class Lab03vst
{
	public static void main(String[] args)

	{
		System.out.println("Lab03, 100 Point Version\n");
		int sms = 10000123;
		System.out.println("Starting milli-seconds:" +"		    " +sms);

		int h = sms / 3600000;
		System.out.println("Hours:"+" 						     " +h);

		int s = sms % 3600000;
		int m = s / 60000;
		System.out.println("Minutes:" + "						"  +m);

		int sr = s % 60000;
		int ms = sr / 1000;
		System.out.println("Seconds:"+" 				    	" +     ms);

		int rms = sr % 1000;
		System.out.println("Milli Seconds:"+"				    " +    rms);










      
	}
}


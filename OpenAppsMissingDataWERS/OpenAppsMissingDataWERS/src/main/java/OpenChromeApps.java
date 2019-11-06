import java.io.IOException;

public class OpenChromeApps 
{
	public static String strStartChrome="C:\\Program Files (x86)\\Google\\Chrome\\Application\\Chrome.exe -noframemerging";
	public static void main(String[] args) 
	{
		java.lang.Process runProcess;
		try 
		{
			Runtime.getRuntime().exec(strStartChrome + " https://www.itsmschange.ford.com/arsys/forms/prodaruser.ford.com/SHR:LandingConsole/Default+Administrator+View/?cacheid=1ee142e");
			Thread.sleep(6000);
			Runtime.getRuntime().exec(strStartChrome + " http://www.par.ford.com");
			Thread.sleep(6000);
			Runtime.getRuntime().exec(strStartChrome + " https://rally1.rallydev.com/#/273320135180ud/userstories?tpsSI=0&tpsV=sq%3A303425409296");
			Thread.sleep(6000);
			Runtime.getRuntime().exec(strStartChrome + " https://splunk.shc.ford.com/en-US/app/fedebom/fede_application_monitoring_business");
			Thread.sleep(6000);
			Runtime.getRuntime().exec(strStartChrome + " https://github.com/Ford");
			Thread.sleep(6000);
			Runtime.getRuntime().exec(strStartChrome + " http://syc3.dearborn.ford.com:41002/w2h/WEB2AJAX.htm+IMSE5");
			

		} 
		catch (IOException | InterruptedException  e) 
		{
		
			e.printStackTrace();
		}


	}

}

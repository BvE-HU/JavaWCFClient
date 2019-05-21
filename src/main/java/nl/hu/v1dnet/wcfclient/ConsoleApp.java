package nl.hu.v1dnet.wcfclient;

import nl.hu.v1dnet.wcfservice.IMyService;
import nl.hu.v1dnet.wcfservice.MyService;

public class ConsoleApp 
{
    public static void main( String[] args )
    {
    	IMyService service = new MyService().getBasicHttpBindingIMyService();
    	
    	System.out.println(service.getCurrentDateTime());
    }
}

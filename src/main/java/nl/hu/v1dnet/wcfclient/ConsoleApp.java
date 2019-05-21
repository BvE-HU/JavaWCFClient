package nl.hu.v1dnet.wcfclient;

import nl.hu.v1dnet.wcfservice.DateService;
import nl.hu.v1dnet.wcfservice.IDateService;

public class ConsoleApp
{
    public static void main( String[] args ) {
        DateService service = new DateService();
        IDateService proxy = service.getBasicHttpBindingIDateService();

        System.out.println(proxy.getCurrentDateTime());
    }
}

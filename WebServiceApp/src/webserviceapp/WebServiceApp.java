/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceapp;

import com.najeeb.webservices.HelloService;
import com.najeeb.webservices.HelloService_Service;

/**
 *
 * @author Naila
 */
public class WebServiceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloService_Service service = new HelloService_Service();
        final HelloService proxy = service.getHelloServicePort();
        System.out.println(proxy.hello("Najeeb Rana !!!!"));
    }
    
}

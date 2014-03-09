package com.pms.webservice;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.pms.domain.TdOrder;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class POSPlaceOrderWS {
    
    @WebMethod(operationName = "TdPlaceOrder")
    public String listRooms(@WebParam(name = "TdOrder") TdOrder order) {
    
    	return null;
    }
        
    
    private String returnFaultObject(String code, String message, String reason, String description, String service){
    	String msg = "<soap:Fault xmlns:soap='http://schemas.xmlsoap.org/soap/envelope/'"; 
    		   msg += "xmlns='' >";
    		   msg += "<faultcode>"+code+"</faultcode>";
    		   msg += "<faultstring>"+message+"</faultstring>";
    		   msg += "<faultreason>"+reason+"</faultreason>";
    		   msg += "<detail>";
    		   msg += description;
    		   msg += "</detail>";
    		   msg += "<service>"+service+"</service>";
    		   msg += "</soap:Fault>";
    	System.out.println(msg);
    	return msg;
    }
    
}

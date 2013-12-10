package com.pms.webservice;


import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.domain.Guest;
import com.pms.domain.ListRooms;
import com.pms.domain.Reservation;
import com.pms.domain.Room;
import com.pms.service.GuestService;
import com.pms.service.ReservationService;
import com.pms.service.RoomService;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class SoapOperationService {
    private static final String HELLO = "Hello";
    
    @Autowired
	private RoomService roomService;
    
    @Autowired
    private GuestService guestService;
    
    @Autowired
    private ReservationService reservationService;

    @WebMethod(operationName = "sayHello")
    public String sayHelloToTheUser(@WebParam(name = "name") String userName) {
        return HELLO + " " + userName;
    }
    
    @WebMethod(operationName = "listRooms")
    public Room[] listRooms(@WebParam(name = "roomList") ListRooms roomList) {
    	ArrayList<Room> objects = null;
        List<Room> rooms = null;
        Double fromPrice = (double) 0;
        Double toPrice = (double) 0;
        String isComposite = null;
        String isSmoking = null;
        System.out.println("HERE");
        if(null != roomList.getFromPrice() && !"".equalsIgnoreCase(roomList.getFromPrice().trim())){
        	BigDecimal sPrice = new BigDecimal(roomList.getFromPrice().trim());
        	fromPrice = sPrice.doubleValue();
        }
        if(null != roomList.getToPrice() && !"".equalsIgnoreCase(roomList.getToPrice().trim())){
        	BigDecimal sPrice = new BigDecimal(roomList.getToPrice().trim());
        	toPrice = sPrice.doubleValue();
        }
        if(null != roomList.getIsComposite() && !"".equalsIgnoreCase(roomList.getIsComposite().trim())){
        	isComposite = roomList.getIsComposite();
        }
        if(null != roomList.getIsSmoking() && !"".equalsIgnoreCase(roomList.getIsSmoking().trim())){
        	isSmoking = roomList.getIsSmoking();
        }
        System.out.println(fromPrice);
        System.out.println(toPrice);
        System.out.println(isComposite);
        System.out.println(isSmoking);
        try{
        	System.out.println("HERE1");
        	String query = "select myRoom from Room myRoom where ";
        	int counter = 1;
        	rooms = roomService.findAllRooms(-1, -1);
        	System.out.println("HERE2");
        	if(null != rooms){
        		objects = new ArrayList<Room>();
        		for(Room room:rooms){
        			boolean flagFromPrice = false;
        			boolean flagToPrice = false;
        			boolean flagIsComposite = false;
        			boolean flagIsSmoking = false;
        			if(0 < fromPrice){
        				if(0 < toPrice){
                			System.out.print("From Price + To Price: "+room.getRoomRate().doubleValue());
        					if(room.getRoomRate().doubleValue() >= fromPrice && room.getRoomRate().doubleValue() <= toPrice){
        						//objects.add(room);
        						flagToPrice = true;
        					}
        				}else{
        					flagToPrice = false;
        				}
        			}else{
        				flagFromPrice = false;
        			}
        			if(null != isComposite && null != room.getIsComposite() && room.getIsComposite().equalsIgnoreCase(isComposite)){
            			System.out.print(",Composite: "+room.getIsComposite());
        				flagIsComposite = true;
        			}
        			if(null == isComposite){
        				flagIsComposite = false;
        			}
        			if(null != isSmoking && null != room.getIsSmoking() && room.getIsSmoking().equalsIgnoreCase(isSmoking)){
            			System.out.println(",Smoking: "+room.getIsSmoking());
        				flagIsSmoking = true;
        			}
        			if(null == isSmoking){
        				flagIsSmoking = false;
        			}
        			
        			if((flagFromPrice && flagToPrice) || (flagIsComposite && flagIsSmoking))
        				objects.add(room);
        		}
        	}else{
        		Room[] r = new Room[1];
        		Room room = new Room();
        		room.setError(returnFaultObject("1","No data found.","There are no rooms in the database.","There should be rooms in the database.","listRooms"));
        		r[0] = room;
        	}
        }catch(Exception e){
        	e.printStackTrace();
        	Room[] r = new Room[1];
    		Room room = new Room();
    		room.setError(returnFaultObject("1","No data found.","There are no rooms in the database.","There should be rooms in the database.","listRooms"));
    		r[0] = room;
        }
        if(objects.size() <= 0){
        	Room[] r = new Room[1];
    		Room room = new Room();
    		room.setError(returnFaultObject("1","No results found.","No results found matching criteria.","There are no results found matching input criteria. Please try again...","listRooms"));
    		r[0] = room;
        }
        System.out.println("FINAL");
        Room[] room = new Room[objects.size()];
        int i=0;
        for(Room rr:objects){
        	room[i] = rr;
        	i++;
        }
        return room;
    }
    
    @WebMethod(operationName = "updateGuestStayInfo")
    public Reservation updateGuestStayInfo(@WebParam(name = "confirmationNumber") Integer reservationId,@WebParam(name = "departureDate") String departureDate,@WebParam(name = "guestLastName") String guestLastName,@WebParam(name = "guestEmail") String email) {
    	Reservation res = new Reservation();
    	boolean flag = false;
    	try{
	    	Guest guest = guestService.findGuestByLastNameEmail(guestLastName, email);
	    	System.out.println("HERE");
	    	if(null != guest){
	    		Set<Reservation> reservations = guest.getReservations();
	    		for(Reservation r:reservations){
	    			int v1 = r.getReservationId();
	    			int v2 = reservationId;
	    			System.out.println("RESERVATION ID IS: "+v1);
	    			System.out.println("RESERVATION ID IS RES: "+v2);
	    			if(v1 == v2){
	    				System.out.println("I AM IN");
	    				Calendar cal = Calendar.getInstance();
	    				System.out.println("AFTER CAL INSTANCE");
	    				try {
	    					System.out.println("1");
		    				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    				System.out.println("2");
		    				System.out.println(departureDate);
	        				cal.setTime(simpleDateFormat.parse(departureDate));
	        				System.out.println("4");
	    				} catch (Exception e) {
	    					e.printStackTrace();
	    					Reservation re = new Reservation();
	    					re.setError(returnFaultObject("2","Can not parse.","Date Parsing error.","Service is unable to parse the supplied date. Please provide the date in format: MM/dd/yyyy e.g. 12/29/2013","updateGuestStayInfo"));
	    					return re;
	    				}
	    				System.out.println("DATE PARSED");
	    				r.setDepartureDate(cal);
	    				reservationService.saveReservation(r);
	    				flag = true;
	    				break;
	    			}
	    		}
	    	}else{
	    		Reservation r = new Reservation();
	    		System.out.println("NOTFOUND");
	    		r.setError(returnFaultObject("2","Can not find.","There are no results found.","There are no results found against the provided username and email.","updateGuestStayInfo"));
	    		return r;	        	
	    	}
    	}catch(Exception e){
    		e.printStackTrace();
    		Reservation r = new Reservation();
    		r.setError(returnFaultObject("2","Unexpected Error","Could not process","An unexpected error has occured. Please try again or contact Server administrator.","updateGuestStayInfo"));
    		return r;
    	}
    	if(!flag){
    		Reservation r = new Reservation();
    		System.out.println("NOTFOUND FLAG");
    		r.setError(returnFaultObject("2","Can not find.","There are no results found.","There are no results found against the provided username and email.","updateGuestStayInfo"));
    		return r;
    	}
    	return reservationService.findReservationByPrimaryKey(reservationId);
    }
    
    @WebMethod(operationName = "userPicture")
    public String userPic(@WebParam(name = "confirmationNumber") Integer reservationId,@WebParam(name = "userPic") String signatureFile) {
    	try{
	    	byte[] sig = signatureFile.getBytes();
	    	Guest guest = null;
	    	Reservation res = reservationService.findReservationByPrimaryKey(reservationId);
	    	if(null != res){
		    	guest = res.getGuest();
	    		if(null != guest){
	    			guest.setUserPic(sig);
	    		}
	    		guestService.saveGuest(guest);
	    		return "<confirmationNumber>"+reservationId+"</confirmationNumber><status>"+"success"+"</status>";
	    	}
    	}catch(Exception e){
    		return "<confirmationNumber>"+reservationId+"</confirmationNumber><status>"+"failure"+"</status>";
    	}
    	return "<confirmationNumber>"+reservationId+"</confirmationNumber><status>"+"failure"+"</status>";
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

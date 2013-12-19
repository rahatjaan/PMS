package com.pms.webservice;


import ige.integration.messages.Messages;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.springframework.beans.factory.annotation.Autowired;

import com.pms.domain.Guest;
import com.pms.domain.ListReservations;
import com.pms.domain.ListRooms;
import com.pms.domain.ReqListReservations;
import com.pms.domain.ResRoom;
import com.pms.domain.Reservation;
import com.pms.domain.ReservationDetails;
import com.pms.domain.Room;
import com.pms.domain.Transactions;
import com.pms.domain.UpdateReservationReq;
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
        	rr.setReservations(null);
        	room[i] = rr;
        	i++;
        }
        return room;
    }
    
<<<<<<< HEAD
    @WebMethod(operationName = "updateReservation")
    public Reservation updateGuestStayInfo(@WebParam(name = "confirmationNumber") String reservationId,@WebParam(name = "departureDate") String departureDate,@WebParam(name = "arrivalDate") String arrivalDate,@WebParam(name = "reservationDetails") UpdateReservationReq resDetails) {
    	try{
	    	if(resDetails.getIsCheckedOut().trim().equalsIgnoreCase("0")){
	    		return checkIn(reservationId,departureDate,arrivalDate,Integer.parseInt(resDetails.getRoomId()));
	    	}else if(resDetails.getIsCheckedOut().trim().equalsIgnoreCase("1")){
	    		return checkOut(reservationId,departureDate,arrivalDate,resDetails);
	    	}else{
	    		return updateReservation(reservationId,departureDate,arrivalDate,resDetails);
	    	}
    	}catch(Exception e){
    		Reservation re = new Reservation();
			re.setError(returnFaultObject("2","Exception Occured.","Is your input valid?","Kindly input the right parameters or contact Administrator.","updateReservation"));
			return re;
    	}
    }
    
    private Reservation checkIn(String reservationId,String departureDate,String arrivalDate,Integer roomId){
    	Reservation reservation = reservationService.findReservationByConfirmationNumber(reservationId);
    	Room room = roomService.findRoomByPrimaryKey(roomId);
    	reservation.setRoom(room);
    	reservation.setIsCheckedOut("0");
    	return reservation;
    }
    
    private Reservation checkOut(String reservationId,String departureDate,String arrivalDate,UpdateReservationReq resDetails){
    	Reservation res = null;
    	res = reservationService.findReservationByPrimaryKey(Integer.parseInt(reservationId));
    	res.setIsCheckedOut("1");
    	reservationService.saveReservation(res);
    	return res;
    }
    
    private Reservation updateReservation(String reservationId,String departureDate,String arrivalDate,UpdateReservationReq resDetails){
    	Integer reservation_id;
=======
    @WebMethod(operationName = "updateGuestStayInfo")
    public Reservation updateGuestStayInfo(@WebParam(name = "confirmationNumber") Integer reservationId,@WebParam(name = "departureDate") String departureDate,@WebParam(name = "guestLastName") String guestLastName,@WebParam(name = "guestEmail") String email) {
>>>>>>> 30bab868df3d2154ce37d96c3c120b825d55d852
    	boolean flag = false;
    	try{
	    	Reservation reservation = reservationService.findReservationByConfirmationNumber(reservationId);
	    	if(null != reservation){
	    		reservation_id = reservation.getReservationId();
		    	Calendar cal1 = Calendar.getInstance();
		    	Calendar cal2 = Calendar.getInstance();
		    	Calendar cal3 = Calendar.getInstance(); 
				System.out.println("AFTER CAL INSTANCE");
				try {
					System.out.println("1");
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
					System.out.println("2");
					System.out.println(departureDate);
					cal1.setTime(simpleDateFormat.parse(departureDate));
					cal2.setTime(simpleDateFormat.parse(arrivalDate));
					if(null != resDetails.getCardExpiryDate()){
						cal3.setTime(simpleDateFormat.parse(resDetails.getCardExpiryDate()));
					}
					System.out.println("4");
				} catch (Exception e) {
					e.printStackTrace();
					Reservation re = new Reservation();
					re.setError(returnFaultObject("2","Can not parse.","Date Parsing error.","Service is unable to parse the supplied date. Please provide the date in format: MM/dd/yyyy e.g. 12/29/2013","updateGuestStayInfo"));
					return re;
				}
				System.out.println("DATE PARSED");
				reservation.setDepartureDate(cal1);
				reservation.setArrivalDate(cal2);
				reservation.setCardExpiryDate(cal3);
				if(null != resDetails.getCardType() && !"".equalsIgnoreCase(resDetails.getCardType())){
					reservation.setCardType(resDetails.getCardType());
				}
				if(null != resDetails.getCardNumber() && !"".equalsIgnoreCase(resDetails.getCardNumber())){
					reservation.setCardNumber(resDetails.getCardNumber());
				}
				if(null != resDetails.getSpecialRequests() && !"".equalsIgnoreCase(resDetails.getSpecialRequests())){
					reservation.setSpecialRequests(resDetails.getSpecialRequests());
				}
				if(null != resDetails.getCvvNumber() && !"".equalsIgnoreCase(resDetails.getCvvNumber())){
					reservation.setCvvNumber(resDetails.getCvvNumber());
				}
				if(null != resDetails.getFolioNumber() && !"".equalsIgnoreCase(resDetails.getFolioNumber())){
					reservation.setFolioNumber(resDetails.getFolioNumber());
				}
				if(null != resDetails.getCurrencyCode() && !"".equalsIgnoreCase(resDetails.getCurrencyCode())){
					reservation.setCurrencyCode(resDetails.getCurrencyCode());
				}
				if(null != resDetails.getNumberOfChildren()){
					reservation.setNumberOfChildren(Integer.parseInt(resDetails.getNumberOfChildren()));
				}
				if(null != resDetails.getNumberOfAdults()){
					reservation.setNumberOfAdults(Integer.parseInt(resDetails.getNumberOfAdults()));
				}
				reservationService.saveReservation(reservation);
				flag = true;
	    	}/*
	    	
	    	
	    	
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
	    	}*/else{
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
    	return reservationService.findReservationByPrimaryKey(reservation_id);
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
    
    //************************* NEW APIS
    @WebMethod(operationName = "getBillInfo")
    public Guest getBillInfo(@WebParam(name = "lastName") String userName,@WebParam(name = "email") String email,@WebParam(name = "roomNumber") String roomNumber) {
    	Guest info = null;
    	Object obj = null;
    	try{
    		obj = reservationService.findGuestBillInfo(email, userName, roomNumber);
    		System.out.println("FIRST NAME IS: "+((Guest) obj).getFirstName());
    		info = (Guest) obj;
    		Collection c = info.getReservations();
    		Iterator iter = c.iterator();
    		Reservation first = (Reservation) iter.next();
    		Transactions [] gstArr = first.getTransactionses().toArray(new Transactions[0]);//(GuestTransactions[]) first.getGuestTransactionses().toArray();
    		for(int i=0;i<(gstArr.length-1);i++){
    			for(int j=i;j<gstArr.length;j++){
    				if(gstArr[i].getTransactionDate().after(gstArr[j].getTransactionDate())){
    					Calendar temp = gstArr[i].getTransactionDate();
    					gstArr[i].setTransactionDate(gstArr[j].getTransactionDate());
    					gstArr[j].setTransactionDate(temp);
    				}
    			}
    		}
    		Set<Transactions> mySet = new HashSet<Transactions>(Arrays.asList(gstArr));
    		first.setTransactionses(mySet);
    		Set<Reservation> gsti = new HashSet<Reservation>();
    		first.setSignature(null);
    		gsti.add(first);
    		info.setUserPic(null);
    		info.setReservations(gsti);
    		obj = info;
    		/*Collections.sort(gst, new Comparator<Calendar>() {
    		    public int compare(Calendar o1, Calendar o2) {
    		    	return (o1.after(o2)?1:0);
    		        //return return (i1 > i2 ? -1 : (i1 == i2 ? 0 : 1));
    		    }
    		});*/
    		//info.setGuestStayInfos(guestStayInfos);
    	}catch(Exception e){
    		Guest gues = new Guest();
    		gues.setError(returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "getBillInfo"));
    		return gues;
    	}
    	if(Messages.CREDENTIALS_MESSAGE.equalsIgnoreCase(obj.toString())){
    		Guest gues = new Guest();
    		gues.setError(returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.CREDENTIALS_REASON, Messages.GETBILLINFO_DESCRIPTION, "getBillInfo"));
    		return gues;
    	}else{
            return info;    		
    	}
    }
    
    
    @WebMethod(operationName = "reservationLookup")
    public ListReservations[] reservationLookup(@WebParam(name = "reservationDetails") ReqListReservations resDetails) {
    	ListReservations[] listReservations = null;
    	try{
	    	String confirmationNumber = resDetails.getConfirmationNumber();
	    	String lastName = resDetails.getLastName();
	    	String creditCard = resDetails.getMaskedCardNumber();
	    	String roomNumber = resDetails.getRoomNumber();
	    	System.out.println("ROOM NUMBER IS: "+roomNumber);
	    	String loyaltyNumber = resDetails.getLoyaltyCardNumber();
	    	Object g = null;
	    	List<Reservation> listRes = new ArrayList<Reservation>();
	    	if(null != confirmationNumber && !"".equalsIgnoreCase(confirmationNumber.trim())){
	    		ListReservations gi = new ListReservations();
	    		g = reservationService.findReservationByConfirmationNumber(confirmationNumber);
	    		if(null == g){
	    			listReservations = new ListReservations[1];
	    			ListReservations l = new ListReservations();
	    			l.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Confirmation Number not found.", "reservationLookup"));
	    			listReservations[0]=l;
	    			return listReservations;
	    		}
	    		Reservation ru = (Reservation) g;

	    		gi.setNamePrefix(ru.getGuest().getNamePrefix());
	    		gi.setFirstName(ru.getGuest().getFirstName());
	    		gi.setLastName(ru.getGuest().getLastName());
	    		gi.setLoyaltyCardNumber(null);
	    		gi.setResDetails(null);
	    		gi.setError(null);	    		
	    		g = ru.getGuest();
	    		gi.setLoyaltyCardNumber(ru.getGuest().getLoyaltyNumber());
	    		ReservationDetails rees = new ReservationDetails();
	    		rees.setConfirmationNumber(Integer.toString(ru.getReservationId()));
	    		rees.setNumberOfAdults(ru.getNumberOfAdults());
	    		rees.setNumberOfChildren(ru.getNumberOfChildren());
	    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				
				String aDate="";
				String dDate = "";
				if (null != ru.getArrivalDate()) {
					aDate = sdf.format(ru.getArrivalDate().getTime());
				} 
				if (null != ru.getDepartureDate()) {
					dDate = sdf.format(ru.getDepartureDate().getTime());
				} 
	    		rees.setStayFromDate(aDate);
	    		rees.setStayToDate(dDate);
	    		Set<Transactions> trans = ru.getTransactionses();
	    		int sum = 0;
	    		for(Transactions t:trans){
	    			sum += t.getCharges();
	    		}
	    		rees.setTotalForStay(Integer.toString(sum));
	    		String card = ru.getCardNumber();
				if(null != card && !"".equalsIgnoreCase(card.trim())){
					if(4 < card.length()){
						card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
					}else{
						card = "XXXXXXXXXXXX"+card;
					}
				}
	    		rees.setMaskedCardNumber(card);
	    		rees.setCurrencyCode(ru.getCurrencyCode());
	    		rees.setSpecialRequests(ru.getSpecialRequests());
	    		if(null != ru.getIsCheckedOut() && ru.getIsCheckedOut().trim().equalsIgnoreCase("0")){
	    			rees.setIsCheckedOut("Booked");
	    		}else if(null != ru.getIsCheckedOut() && ru.getIsCheckedOut().trim().equalsIgnoreCase("1")){
	    			rees.setIsCheckedOut("Checked Out");
	    		}
	    		System.out.println("ROOM ID IS: "+ru.getRoom().getRoomId());
	    		Room rr = ru.getRoom();
	    		ResRoom rs = new ResRoom();
	    		rs.setRoomId(rr.getRoomId());
	    		rs.setRoomCategory(rr.getRoomCategory());
	    		rs.setIsSmoking(rr.getIsSmoking());
	    		rs.setIsComposite(rr.getIsComposite());
	    		rs.setRoomRate(rr.getRoomRate());
	    		rs.setFloorNumber(rr.getFloorNumber());
	    		rs.setImage1(rr.getImage1());
	    		rs.setImage2(rr.getImage2());
	    		rs.setImage3(rr.getImage3());
	    		rs.setImage4(rr.getImage4());
	    		rs.setOccupancy(rr.getOccupancy());
	    		rees.setRoom(rs);
	    		List<ReservationDetails> l = new ArrayList<ReservationDetails>();
	    		l.add(rees);
	    		gi.setResDetails(l);
	    		listReservations = new ListReservations[1];
	    		listReservations[0] = gi;
	    		return listReservations;
	    	}else if(null != lastName && !"".equalsIgnoreCase(lastName.trim()) && null != creditCard && !"".equalsIgnoreCase(creditCard.trim())){
	    		int length = creditCard.length();
	    		String cc = creditCard.substring(length-4);
	    		g = guestService.findGuestLastNameCreditCard(lastName,cc);
	    		if(null == g || g.toString().contains("ERROR")){
	    			listReservations = new ListReservations[1];
	    			ListReservations l = new ListReservations();
	    			l.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Last Name and Masked Number did not match.", "reservationLookup"));
	    			listReservations[0]=l;
	    			return listReservations;
	    		}
	    		Set<Reservation> res = ((Guest) g).getReservations();
	    		List<ListReservations> lis= new ArrayList<ListReservations>(0);
	    		for(Reservation ru:res){
	    			ListReservations gi = new ListReservations();
	    			if(ru.getCardNumber().trim().equalsIgnoreCase(creditCard.trim())){
	    				gi.setNamePrefix(ru.getGuest().getNamePrefix());
	    				gi.setFirstName(ru.getGuest().getFirstName());
	    	    		gi.setLastName(ru.getGuest().getLastName());
	    	    		gi.setLoyaltyCardNumber("");
	    	    		gi.setResDetails(null);
	    	    		gi.setError("");	    		
	    	    		g = ru.getGuest();
	    	    		gi.setLoyaltyCardNumber(ru.getGuest().getLoyaltyNumber());
	    	    		ReservationDetails rees = new ReservationDetails();
	    	    		rees.setConfirmationNumber(Integer.toString(ru.getReservationId()));
	    	    		rees.setNumberOfAdults(ru.getNumberOfAdults());
	    	    		rees.setNumberOfChildren(ru.getNumberOfChildren());
	    	    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    				
	    				String aDate="";
	    				String dDate = "";
	    				if (null != ru.getArrivalDate()) {
	    					aDate = sdf.format(ru.getArrivalDate().getTime());
	    				} 
	    				if (null != ru.getDepartureDate()) {
	    					dDate = sdf.format(ru.getDepartureDate().getTime());
	    				} 
	    	    		rees.setStayFromDate(aDate);
	    	    		rees.setStayToDate(dDate);
	    	    		Set<Transactions> trans = ru.getTransactionses();
	    	    		int sum = 0;
	    	    		for(Transactions t:trans){
	    	    			sum += t.getCharges();
	    	    		}
	    	    		rees.setTotalForStay(Integer.toString(sum));
	    	    		String card = ru.getCardNumber();
	    				if(null != card && !"".equalsIgnoreCase(card.trim())){
	    					if(4 < card.length()){
	    						card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
	    					}else{
	    						card = "XXXXXXXXXXXX"+card;
	    					}
	    				}
	    	    		rees.setMaskedCardNumber(card);
	    	    		rees.setCurrencyCode(ru.getCurrencyCode());
	    	    		rees.setSpecialRequests(ru.getSpecialRequests());
	    	    		Room rr = ru.getRoom();
	    	    		ResRoom rs = new ResRoom();
	    	    		rs.setRoomId(rr.getRoomId());
	    	    		rs.setRoomCategory(rr.getRoomCategory());
	    	    		rs.setIsSmoking(rr.getIsSmoking());
	    	    		rs.setIsComposite(rr.getIsComposite());
	    	    		rs.setRoomRate(rr.getRoomRate());
	    	    		rs.setFloorNumber(rr.getFloorNumber());
	    	    		rs.setImage1(rr.getImage1());
	    	    		rs.setImage2(rr.getImage2());
	    	    		rs.setImage3(rr.getImage3());
	    	    		rs.setImage4(rr.getImage4());
	    	    		rs.setOccupancy(rr.getOccupancy());
	    	    		rees.setRoom(rs);
	    	    		List<ReservationDetails> l = new ArrayList<ReservationDetails>();
	    	    		l.add(rees);
	    	    		gi.setResDetails(l);
	    	    		lis.add(gi);
	    			}
	    		}
	    		listReservations = new ListReservations[lis.size()];
	    		int i=0;
	    		for(ListReservations ll:lis){
	    			listReservations[i]=ll;
	    			i++;
	    		}
	    		return listReservations;
	    	}else if(null != lastName && !"".equalsIgnoreCase(lastName.trim()) && null != roomNumber && !"".equalsIgnoreCase(roomNumber.trim())){
	    		System.out.println("ROOOOOOOM");
	    		g = guestService.findGuestInfoByLastNameRoom(lastName,roomNumber);
	    		if(null == g || g.toString().contains("ERROR")){
	    			listReservations = new ListReservations[1];
	    			ListReservations l = new ListReservations();
	    			l.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Last Name and Room Number did not match.", "reservationLookup"));
	    			listReservations[0]=l;
	    			return listReservations;
	    		}
	    		Set<Reservation> res = ((Guest) g).getReservations();
	    		List<ListReservations> lis= new ArrayList<ListReservations>(0);
	    		for(Reservation ru:res){
	    			ListReservations gi = new ListReservations();
	    			if(ru.getCardNumber().trim().equalsIgnoreCase(creditCard.trim())){
	    				gi.setNamePrefix(ru.getGuest().getNamePrefix());
	    				gi.setFirstName(ru.getGuest().getFirstName());
	    	    		gi.setLastName(ru.getGuest().getLastName());
	    	    		gi.setLoyaltyCardNumber("");
	    	    		gi.setResDetails(null);
	    	    		gi.setError("");	    		
	    	    		g = ru.getGuest();
	    	    		gi.setLoyaltyCardNumber(ru.getGuest().getLoyaltyNumber());
	    	    		ReservationDetails rees = new ReservationDetails();
	    	    		rees.setConfirmationNumber(Integer.toString(ru.getReservationId()));
	    	    		rees.setNumberOfAdults(ru.getNumberOfAdults());
	    	    		rees.setNumberOfChildren(ru.getNumberOfChildren());
	    	    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    				
	    				String aDate="";
	    				String dDate = "";
	    				if (null != ru.getArrivalDate()) {
	    					aDate = sdf.format(ru.getArrivalDate().getTime());
	    				} 
	    				if (null != ru.getDepartureDate()) {
	    					dDate = sdf.format(ru.getDepartureDate().getTime());
	    				} 
	    	    		rees.setStayFromDate(aDate);
	    	    		rees.setStayToDate(dDate);
	    	    		Set<Transactions> trans = ru.getTransactionses();
	    	    		int sum = 0;
	    	    		for(Transactions t:trans){
	    	    			sum += t.getCharges();
	    	    		}
	    	    		rees.setTotalForStay(Integer.toString(sum));
	    	    		String card = ru.getCardNumber();
	    				if(null != card && !"".equalsIgnoreCase(card.trim())){
	    					if(4 < card.length()){
	    						card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
	    					}else{
	    						card = "XXXXXXXXXXXX"+card;
	    					}
	    				}
	    	    		rees.setMaskedCardNumber(card);
	    	    		rees.setCurrencyCode(ru.getCurrencyCode());
	    	    		rees.setSpecialRequests(ru.getSpecialRequests());
	    	    		Room rr = ru.getRoom();
	    	    		ResRoom rs = new ResRoom();
	    	    		rs.setRoomId(rr.getRoomId());
	    	    		rs.setRoomCategory(rr.getRoomCategory());
	    	    		rs.setIsSmoking(rr.getIsSmoking());
	    	    		rs.setIsComposite(rr.getIsComposite());
	    	    		rs.setRoomRate(rr.getRoomRate());
	    	    		rs.setFloorNumber(rr.getFloorNumber());
	    	    		rs.setImage1(rr.getImage1());
	    	    		rs.setImage2(rr.getImage2());
	    	    		rs.setImage3(rr.getImage3());
	    	    		rs.setImage4(rr.getImage4());
	    	    		rs.setOccupancy(rr.getOccupancy());
	    	    		rees.setRoom(rs);
	    	    		List<ReservationDetails> l = new ArrayList<ReservationDetails>();
	    	    		l.add(rees);
	    	    		gi.setResDetails(l);
	    	    		lis.add(gi);
	    			}
	    		}
	    		listReservations = new ListReservations[lis.size()];
	    		int i=0;
	    		for(ListReservations ll:lis){
	    			listReservations[i]=ll;
	    			i++;
	    		}
	    		return listReservations;
	    	}else if(null != loyaltyNumber && !"".equalsIgnoreCase(loyaltyNumber.trim())){
	    		g = guestService.findGuestByLoyaltyNumber(loyaltyNumber);
	    		if(null == g || g.toString().contains("ERROR")){
	    			listReservations = new ListReservations[1];
	    			ListReservations l = new ListReservations();
	    			l.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, "Loyalty Number not found.", "reservationLookup"));
	    			listReservations[0]=l;
	    			return listReservations;
	    		}
	    		Set<Reservation> res = ((Guest) g).getReservations();
	    		List<ListReservations> lis= new ArrayList<ListReservations>(0);
	    		for(Reservation ru:res){
	    			ListReservations gi = new ListReservations();
	    			if(ru.getCardNumber().trim().equalsIgnoreCase(creditCard.trim())){
	    				gi.setNamePrefix(ru.getGuest().getNamePrefix());
	    				gi.setFirstName(ru.getGuest().getFirstName());
	    	    		gi.setLastName(ru.getGuest().getLastName());
	    	    		gi.setLoyaltyCardNumber("");
	    	    		gi.setResDetails(null);
	    	    		gi.setError("");	    		
	    	    		g = ru.getGuest();
	    	    		gi.setLoyaltyCardNumber(ru.getGuest().getLoyaltyNumber());
	    	    		ReservationDetails rees = new ReservationDetails();
	    	    		rees.setConfirmationNumber(Integer.toString(ru.getReservationId()));
	    	    		rees.setNumberOfAdults(ru.getNumberOfAdults());
	    	    		rees.setNumberOfChildren(ru.getNumberOfChildren());
	    	    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	    				
	    				String aDate="";
	    				String dDate = "";
	    				if (null != ru.getArrivalDate()) {
	    					aDate = sdf.format(ru.getArrivalDate().getTime());
	    				} 
	    				if (null != ru.getDepartureDate()) {
	    					dDate = sdf.format(ru.getDepartureDate().getTime());
	    				} 
	    	    		rees.setStayFromDate(aDate);
	    	    		rees.setStayToDate(dDate);
	    	    		Set<Transactions> trans = ru.getTransactionses();
	    	    		int sum = 0;
	    	    		for(Transactions t:trans){
	    	    			sum += t.getCharges();
	    	    		}
	    	    		rees.setTotalForStay(Integer.toString(sum));
	    	    		String card = ru.getCardNumber();
	    				if(null != card && !"".equalsIgnoreCase(card.trim())){
	    					if(4 < card.length()){
	    						card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
	    					}else{
	    						card = "XXXXXXXXXXXX"+card;
	    					}
	    				}
	    	    		rees.setMaskedCardNumber(card);
	    	    		rees.setCurrencyCode(ru.getCurrencyCode());
	    	    		rees.setSpecialRequests(ru.getSpecialRequests());
	    	    		Room rr = ru.getRoom();
	    	    		ResRoom rs = new ResRoom();
	    	    		rs.setRoomId(rr.getRoomId());
	    	    		rs.setRoomCategory(rr.getRoomCategory());
	    	    		rs.setIsSmoking(rr.getIsSmoking());
	    	    		rs.setIsComposite(rr.getIsComposite());
	    	    		rs.setRoomRate(rr.getRoomRate());
	    	    		rs.setFloorNumber(rr.getFloorNumber());
	    	    		rs.setImage1(rr.getImage1());
	    	    		rs.setImage2(rr.getImage2());
	    	    		rs.setImage3(rr.getImage3());
	    	    		rs.setImage4(rr.getImage4());
	    	    		rs.setOccupancy(rr.getOccupancy());
	    	    		rees.setRoom(rs);
	    	    		List<ReservationDetails> l = new ArrayList<ReservationDetails>();
	    	    		l.add(rees);
	    	    		gi.setResDetails(l);
	    	    		lis.add(gi);
	    			}
	    		}
	    		listReservations = new ListReservations[lis.size()];
	    		int i=0;
	    		for(ListReservations ll:lis){
	    			listReservations[i]=ll;
	    			i++;
	    		}
	    		return listReservations;
	    	}
			/*Collection c = ((Guest) g).getReservations();
			Iterator iter = c.iterator();
			Reservation first = (Reservation) iter.next();
			gi.setNamePrefix(((Guest) g).getNamePrefix());
			if(null == gi.getNamePrefix() || "".equalsIgnoreCase(gi.getNamePrefix()))
				gi.setNamePrefix("   ");
			gi.setFirstName(((Guest) g).getFirstName());
			if(null == gi.getFirstName() || "".equalsIgnoreCase(gi.getFirstName()))
				gi.setFirstName("   ");
			gi.setLastName(((Guest) g).getLastName());
			if(null == gi.getLastName() || "".equalsIgnoreCase(gi.getLastName()))
				gi.setLastName("   ");
			gi.setRoom(first.getRoom());
			if(null == gi.getRoomFeatures() || "".equalsIgnoreCase(gi.getRoomFeatures()))
				gi.setRoomFeatures("   ");
			String card = first.getCardNumber();
			if(null != card && !"".equalsIgnoreCase(card.trim())){
				if(4 < card.length()){
					card = "XXXXXXXXXXXX"+card.substring(card.length()-4);
				}else{
					card = "XXXXXXXXXXXX"+card;
				}
			}
			gi.setMaskedCardNumber(card);
			if(null == gi.getMaskedCardNumber() || "".equalsIgnoreCase(gi.getMaskedCardNumber()))
				gi.setMaskedCardNumber("   ");
			gi.setCurrencyCode(first.getCurrencyCode());
			if(null == gi.getCurrencyCode() || "".equalsIgnoreCase(gi.getCurrencyCode()))
				gi.setCurrencyCode("   ");
			gi.setTotalGuests(first.getNumberOfAdults()+first.getNumberOfChildren());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			
			String aDate="";
			String dDate = "";
			if (null != first.getArrivalDate()) {
				aDate = sdf.format(first.getArrivalDate().getTime());
			} 
			if (null != first.getDepartureDate()) {
				dDate = sdf.format(first.getDepartureDate().getTime());
			} 
			System.out.println(aDate+"ARRIVAL DATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
			System.out.println(dDate+"DEPARTURE DATEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
			gi.setStayFromDate(aDate);
			gi.setStayToDate(dDate);
			if(null == gi.getStayFromDate() || "".equalsIgnoreCase(gi.getStayFromDate()))
				gi.setStayFromDate("   ");
			if(null == gi.getStayToDate() || "".equalsIgnoreCase(gi.getStayToDate()))
				gi.setStayToDate("   ");
			gi.setLoyaltyCardNumber(((Guest) g).getLoyaltyNumber());
			if(null == gi.getLoyaltyCardNumber() || "".equalsIgnoreCase(gi.getLoyaltyCardNumber()))
				gi.setLoyaltyCardNumber("   ");
			
			Set<Transactions> t = first.getTransactionses();
			int sum = 0;
			for(Transactions t1:t){
				sum += t1.getCharges();
			}
			if(0 <= sum)
				gi.setTotalForStay(Integer.toString(sum));
			if(null == gi.getTotalForStay() || "".equalsIgnoreCase(gi.getTotalForStay()))
				gi.setTotalForStay("0.0");
			gi.setSpecialRequests(first.getSpecialRequest());
			
			if(null == gi.getSpecialRequests() || "".equalsIgnoreCase(gi.getSpecialRequests()))
				gi.setSpecialRequests("   ");
			if(null != confirmationNumber){
				gi.setConfirmationNumber(confirmationNumber);
			}
			if(null == gi.getConfirmationNumber() || "".equalsIgnoreCase(gi.getConfirmationNumber()))
				gi.setConfirmationNumber("   ");
			if(null != first.getCardNumber() && !"".equalsIgnoreCase(first.getCardNumber().trim())){
				int len = first.getCardNumber().length();
				if(5 < len){
					gi.setMaskedCardNumber(first.getCardNumber().substring(first.getCardNumber().length()-4));
				}else{
					gi.setMaskedCardNumber(first.getCardNumber());
				}
			}*/
    	}catch(NullPointerException e){
    		e.printStackTrace();
    		listReservations = new ListReservations[1];
			ListReservations l = new ListReservations();
			l.setError(returnFaultObject(Messages.FAULT_CODE_DATABASE, Messages.DATABASE_MESSAGE, Messages.DATABASE_REASON, Messages.DATABASE_DESCRIPTION, "reservationLookup"));
			listReservations[0]=l;
			return listReservations;
    	}catch(Exception e){
    		e.printStackTrace();
    		listReservations = new ListReservations[1];
			ListReservations l = new ListReservations();
			l.setError(returnFaultObject(Messages.FAULT_CODE_CREDENTIALS, Messages.CREDENTIALS_MESSAGE, Messages.RESERVATION_REASON, Messages.RESERVATION_DESCRIPTION, "reservationLookup"));
			listReservations[0]=l;
			return listReservations;
    	}
    	return listReservations;
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

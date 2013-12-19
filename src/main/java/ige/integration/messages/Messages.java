package ige.integration.messages;

public class Messages {
	
	//***Fault Codes ***
	public static final String FAULT_CODE_DATABASE = "1";
	public static final String FAULT_CODE_CREDENTIALS = "2";
	//******************
	
	public static final String DATABASE_MESSAGE = "Database transaction issue.";
	public static final String CREDENTIALS_MESSAGE = "Input parameters are either incorrect or don't match.";
	public static final String CREDENTIALS_REASON = "Please verify if the number of input parameters are right and parameters are case-sensitive.";
	public static final String GETBILLINFO_DESCRIPTION = "Following parameters are required: lastName,email,roomNumber   !!!Remember parameter names are case-sensitive!!!";
	public static final String DATABASE_REASON = "Either provided credentials are not found in the database, please retry or contact Administrator.";
	public static final String DATABASE_DESCRIPTION = "The information you are trying to save/find in the database is not saved/found properly. Kindly verify the input parameters.";
	public static final String CHECKOUT_DESCRIPTION = "Following parameters are required: lastName,email,creditCardNumber   !!!Remember parameter names are case-sensitive!!!";
	public static final String RESERVATION_REASON = "Please verify if the number of input parameters are right and parameters are case-sensitive.";
	public static final String RESERVATION_DESCRIPTION = "Please provide any of these three: (1). Reservation Confirmation Number (2). Last Name AND Last 4 digits of Credit Card (3). Hotel Loyalty Number  !!!Remember parameter names are case-sensitive!!!";
	public static final String FOLIO_REASON = "Please verify if the number of input parameters are right and parameters are case-sensitive.";
	public static final String FOLIO_DESCRIPTION = "Please provide these three in the right order: (1). terminalId (2). reservationNumber (3). folioType  !!!Remember parameter names are case-sensitive!!!";
}

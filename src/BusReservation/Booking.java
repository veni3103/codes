package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busno;
	Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name: ");
		passengerName=scanner.next();
		System.out.println("Enter bus no: ");
		busno=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy ");
		String dateInput=scanner.next();
		SimpleDateFormat dateformat =new SimpleDateFormat("dd-MM-yyyy");
		try {
			date= dateformat.parse(dateInput);
			
		}catch(ParseException e){
			e.printStackTrace();
		}
		
		}
	}



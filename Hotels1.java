import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.regex.Pattern;
class Destination 
{
	
	static final String CYAN_BOLD = "\033[1;36m";
    	static final String yellow = "\u001b[33;1m";
	static String reset = "\u001B[0m";
    	private String name;
    	private String description;
    	private String activities;
    	static Scanner sc = new Scanner(System.in);
    	Destination(String name, String description, String activities)
	{
        	this.name = name;
        	this.description = description;
        	this.activities = activities;
    	}

    	public void displayDestination()
	{
        	System.out.println(CYAN_BOLD + "Destination: " + name +reset);
        	System.out.println(yellow+ "Description: " + description +reset);
        	System.out.println("Popular Activities: " + activities);
        	System.out.println("--------------------------------------------");
    	}
}

class DestinationService 
{
	static String orange = "\u001B[38;5;208m";
     	static String pink = "\u001B[38;5;205m";
     	static String teal = "\u001B[38;5;37m";
     	static String olive = "\u001B[38;5;58m";
     	static String maroon = "\u001B[38;5;88m";
	static String magenta="\u001B[35m";
	static final String CYAN_BOLD = "\033[1;36m";
	static final String GREEN_BOLD = "\033[1;32m";
	static final String def = "\u001b[0;1m";
   	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
   	static final String purpe = "\u001b[35;1m";
   	static final String skblue = "\u001b[36;1m";
   	static final String bgred =  "\u001b[101;1m";
   	static final String bggreen = "\u001b[102;1m";
   	static final String bgyellow = "\u001b[103;1m";
   	static final String bgblue = "\u001b[104;1m";
   	static final String bgpurpe = "\u001b[105;1m";
   	static final String bgskblue = "\u001b[106;1m";
	static String reset = "\u001B[0m";
	static Scanner sc = new Scanner(System.in);
    	public static void exploreDestinations()
	{
		System.out.println(CYAN_BOLD + "Welcome to Travel Companion!" +reset);
       		 System.out.println(green+ "Your personal travel planner for Hyderabad." +reset);
        	System.out.println(GREEN_BOLD + "Explore Hyderabad's Beautiful Destinations!" +reset);

        	ArrayList<Destination> hyderabadDestinations = new ArrayList<>();

       
        hyderabadDestinations.add(new Destination("Charminar", "A historical monument and mosque, an iconic landmark of Hyderabad.", "Shopping, Sightseeing, Photography"));
        hyderabadDestinations.add(new Destination("Golconda Fort", "A fort with rich history and stunning architecture, known for its acoustics.", "Historical tours, Trekking, Photography"));
        hyderabadDestinations.add(new Destination("Hussain Sagar Lake", "A heart-shaped lake with the famous Buddha statue.", "Boating, Sightseeing, Evening walks"));
        hyderabadDestinations.add(new Destination("Ramoji Film City", "One of the largest film cities in the world with movie sets and theme parks.", "Film studio tours, Amusement park rides, Shows"));
        hyderabadDestinations.add(new Destination("Salar Jung Museum", "One of the largest art museums in India housing a vast collection of art, antiques, and manuscripts.", "Museum tours, History exploration"));
        hyderabadDestinations.add(new Destination("Birla Mandir", "A beautiful temple dedicated to Lord Venkateshwara, built from white marble.", "Spiritual visits, Temple tours, Panoramic city views"));
        hyderabadDestinations.add(new Destination("Nehru Zoological Park", "A popular zoo with various animals and a safari park.", "Wildlife tours, Picnics, Toy train rides"));
        hyderabadDestinations.add(new Destination("Chowmahalla Palace", "A historical palace of the Nizams showcasing royal grandeur.", "Palace tours, Historical exploration, Photography"));
        hyderabadDestinations.add(new Destination("Lumbini Park", "A beautiful park near Hussain Sagar Lake with musical fountains and boat rides.", "Boating, Fountain shows, Picnics"));
        hyderabadDestinations.add(new Destination("Shilparamam", "An arts and crafts village promoting local artisans.", "Shopping, Cultural festivals, Handicrafts"));

          for (Destination destination : hyderabadDestinations)
	{
            destination.displayDestination();
        }
		System.out.println(green+"Enter your choice"+reset);
		System.out.println(teal+"1.Places in Hyderabad"+reset);
		System.out.println(teal+"2.Ticket Booking"+reset);
		System.out.println(teal+"3.Hotel Booking"+reset);
		System.out.println(teal+"4.Exit"+reset);
	int a=sc.nextInt();
		switch(a)
		{
			case 1:
				exploreDestinations();
				break;
			case 2:
				TelanganaToHyderabadTravel.travels();
				break;
			case 3:
        			Hotels1.Hotelbooking();
				break;
			case 4:
				System.out.println(green+"Thanks for visiting"+reset);
				break;
		}

    }
}
class Destination1 extends DestinationService 
{
    private String name;
    private String description;
    private String activities;

    public Destination1(String name, String description, String activities)
   {
        this.name = name;
        this.description = description;
        this.activities = activities;
    }

    public  void displayDestination1()
    {
        System.out.println("Destination: " + name);
        System.out.println("Description: " + description);
        System.out.println("Popular Activities: " + activities);
        System.out.println("--------------------------------------------");
    }
}

class TelanganaToHyderabadTravel extends DestinationService
{
	static String orange = "\u001B[38;5;208m";
     	static String pink = "\u001B[38;5;205m";
     	static String teal = "\u001B[38;5;37m";
     	static String olive = "\u001B[38;5;58m";
     	static String maroon = "\u001B[38;5;88m";
	static String magenta="\u001B[35m";
	static final String CYAN_BOLD = "\033[1;36m";
	static final String GREEN_BOLD = "\033[1;32m";
	static final String def = "\u001b[0;1m";
   	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
   	static final String purpe = "\u001b[35;1m";
   	static final String skblue = "\u001b[36;1m";
   	static final String bgred =  "\u001b[101;1m";
   	static final String bggreen = "\u001b[102;1m";
   	static final String bgyellow = "\u001b[103;1m";
   	static final String bgblue = "\u001b[104;1m";
   	static final String bgpurpe = "\u001b[105;1m";
   	static final String bgskblue = "\u001b[106;1m";
	//static String reset = "\u001B[0m";
	static String reset = "\u001B[0m";
	static Scanner sc=new Scanner(System.in);
    	public static void travels()
	{
        	Scanner sc = new Scanner(System.in);
        	String[] cities = {
            "Warangal", "Karimnagar", "Nizamabad", "Khammam", "Adilabad",
            "Mahabubnagar", "Medak", "Nalgonda", "Rangareddy", "Jogulamba Gadwal"
        };

        int[][] travelCosts = {
            {400, 250, 800}, {350, 200, 700}, {500, 300, 900},
            {450, 280, 850}, {550, 320, 1000}, {600, 350, 1100},
            {500, 300, 900}, {400, 250, 800}, {300, 200, 700}, {650, 400, 1200}
        };

        int[] busSeats = {50, 40, 45, 50, 30, 35, 40, 50, 45, 25};
        int[] trainSeats = {100, 90, 80, 70, 60, 50, 90, 85, 95, 40};

        String[][] trainDetails = {
            {"Warangal Express (7:00 AM, 2 hrs)", "Hyderabad Superfast (9:30 AM, 1 hr 45 mins)"},
            {"Karimnagar Express (6:45 AM, 2 hrs)", "Telangana Local (10:00 AM, 2 hrs 30 mins)"},
            {"Nizamabad Passenger (5:30 AM, 3 hrs)", "Hyderabad Intercity (8:15 AM, 2 hrs 15 mins)"},
            {"Khammam Express (7:15 AM, 2 hrs 30 mins)", "Hyderabad Special (10:30 AM, 2 hrs 15 mins)"},
            {"Adilabad Intercity (6:00 AM, 4 hrs)", "Hyderabad Superfast (11:00 AM, 3 hrs 30 mins)"},
            {"Mahabubnagar Express (5:00 AM, 2 hrs 45 mins)", "Hyderabad Fast Passenger (9:00 AM, 2 hrs 30 mins)"},
            {"Medak Passenger (6:30 AM, 3 hrs)", "Hyderabad Special (9:30 AM, 2 hrs 45 mins)"},
            {"Nalgonda Local (6:15 AM, 2 hrs)", "Hyderabad Express (10:45 AM, 1 hr 45 mins)"},
            {"Rangareddy Intercity (7:30 AM, 1 hr 30 mins)", "Hyderabad Local (9:30 AM, 1 hr)"},
            {"Jogulamba Gadwal Express (6:00 AM, 5 hrs)", "Hyderabad Special (12:00 PM, 4 hrs 30 mins)"}
        };

        try
	{
            System.out.println(green+"Welcome to Telangana Travel System!"+reset);
            System.out.println(green+"Choose your city from Telangana (excluding Hyderabad):"+reset);

            for (int i = 0; i < cities.length; i++)
	    {
                System.out.println((i + 1) + ". " + cities[i]);
            }

            System.out.print(green+"Enter your choice (1-" + cities.length + "): "+reset);
            int cityChoice = sc.nextInt();
            sc.nextLine();

           while(cityChoice>2 || cityChoice<1)
	   {
			System.out.println(red+"Invalid Choice choose correct one from above :"+reset);
			cityChoice = sc.nextInt();
            		sc.nextLine();

	   }


            String city = cities[cityChoice - 1];
            System.out.println(green+"\nChoose your mode of travel to Hyderabad:"+reset);
            System.out.println(teal+"1. Bus"+reset);
            System.out.println(teal+"2. Train"+reset);
            System.out.print(purpe+"Enter your choice (1/2): "+reset);
            int travelChoice = sc.nextInt();
            sc.nextLine();

	   while(travelChoice>2 || travelChoice<1)
	   {
		System.out.println(red+"Invalid Choice choose correct one from above :"+reset);
		travelChoice = sc.nextInt();
            	sc.nextLine();

	    }
            String travelMode = travelChoice == 1 ? "Bus" : "Train";
            int travelCost = travelCosts[cityChoice - 1][travelChoice - 1];

            int availableSeats = 0;
            if (travelChoice == 1)
	    {
                availableSeats = busSeats[cityChoice - 1];
                System.out.println(teal+"\nAvailable seats on the Bus: " + availableSeats+reset);
            }
	    else if (travelChoice == 2)
	    {
                availableSeats = trainSeats[cityChoice - 1];
                System.out.println(teal+"\nAvailable seats on the Train: " + availableSeats+reset);

                System.out.println(purpe+"\nAvailable trains from " + city + " to Hyderabad:"+reset);
                String[] availableTrains = trainDetails[cityChoice - 1];
                for (int i = 0; i < availableTrains.length; i++)
		{
                    System.out.println((i + 1) + ". " + availableTrains[i]);
                }
                System.out.print(green+"Choose your train (1-" + availableTrains.length + "): "+reset);
                int trainChoice = sc.nextInt();
                sc.nextLine();

                while(trainChoice>2 || trainChoice<1)
		{
			System.out.println(red+"Invalid Choice choose correct one from above :"+reset);
			trainChoice = sc.nextInt();
            		sc.nextLine();

		}

                System.out.println(green+"\nYou have selected: " + availableTrains[trainChoice - 1]+reset);
            }

            System.out.println(teal+"\nDo you want to book a ticket? (y/n): "+reset);
            String bookingConfirmation = sc.nextLine().toLowerCase();

            if (bookingConfirmation.equals("y"))
	    {
                System.out.println(purpe+"\nWould you like to confirm your booking? (y/n): "+reset);
                String confirmation = sc.nextLine().toLowerCase();

                if (!confirmation.equals("y"))
		{
                    System.out.println(red+"Booking cancelled."+reset);
                    return;
                }

                System.out.println(teal+"\nChoose your payment method:"+reset);
                System.out.println(purpe+"1. UPI"+reset);
                System.out.println(purpe+"2. Credit Card"+reset);
                System.out.print(green+"Enter your choice (1/2): "+reset);
                int paymentChoice = sc.nextInt();
                sc.nextLine();
		while( paymentChoice>2 ||  paymentChoice<1)
		{
			System.out.println(red+"Invalid Choice choose correct one from above :"+reset);
			 paymentChoice = sc.nextInt();
            		sc.nextLine();

		}


                String paymentMethod;
                switch (paymentChoice)
		{
                    case 1:
                        paymentMethod = "UPI";
                        System.out.print(green+"Enter your UPI ID: "+reset);
                        String upiId = sc.nextLine();
			System.out.println(teal+"\nWould you like to confirm your booking? (y/n): "+reset);
                	String Confirmation = sc.nextLine().toLowerCase();
                        System.out.println(purpe+"\nPayment of " + travelCost + " completed using UPI ID: " + upiId + "."+reset);
                        break;
                    case 2:
                        paymentMethod = "Credit Card";
                        // Credit Card Validation
                        String cardNumber;
                        String expiryDate;
                        String cvv;
                        boolean isValidCard = false;
                        while (!isValidCard)
			{
                            System.out.print(green+"Enter your Credit Card Number (16 digits): "+reset);
                            cardNumber = sc.nextLine();
                            if (validateCreditCard(cardNumber))
			    {
                                System.out.print(teal+"Enter Expiry Date (MM/YY): "+reset);
                                expiryDate = sc.nextLine();
                                if (validateExpiryDate(expiryDate))
				{
                                    System.out.print(teal+"Enter CVV (3 digits): "+reset);
                                    cvv = sc.nextLine();
                                    if (validateCVV(cvv))
				    {
                                        System.out.println(purpe+"Payment of ₹" + travelCost + " completed using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4) + "."+reset);
                                        isValidCard = true;
                                    }
				    else
				    {
                                        System.out.println(red+"Invalid CVV. Please try again."+reset);
                                    }
                                }
				else
				{
                                    System.out.println(red+"Invalid expiry date. Please try again."+reset);
                                }
                            }
			    else
			    {
                                System.out.println(red+"Invalid Credit Card Number. Please try again."+reset);
                            }
                        }
                        break;
                    default:
                        throw new IllegalArgumentException(green+"Invalid payment method selected."+reset);
                }
                if (travelChoice == 1)
		{
                    busSeats[cityChoice - 1]--;
                }
		else if (travelChoice == 2)
		{
                    trainSeats[cityChoice - 1]--;
                }

                System.out.println(green+"\nBooking confirmed! Ticket details:"+reset);
		System.out.println("----------------------------------------------");
                System.out.println("|"+"From: " + city+"                              |");
                System.out.println("|"+"To: Hyderabad"+"                               |");
                System.out.println("|"+"Mode of Travel: " + travelMode+"                         |");
                System.out.println("|"+"Cost: " + travelCost+"                                   |");
                System.out.println("|"+"Seat Number: " + (travelChoice == 1 ? (50 - busSeats[cityChoice - 1]) : (100 - trainSeats[cityChoice - 1]))+"                              |");
		System.out.println("----------------------------------------------");
            } 
        } catch (Exception e)
	{
            System.out.println("Error: " + e.getMessage());
        }
	finally
	{
        }
		System.out.println(green+"Enter your choice" +reset);
		System.out.println(teal+"1.Places in Hyderabad"+reset);
		System.out.println(teal+"2.Ticket Booking"+reset);
		System.out.println(teal+"3.Hotel Booking"+reset);
		System.out.println(teal+"4.Exit"+reset);

		int a=sc.nextInt();
		switch(a)
		{
			case 1:
				exploreDestinations();
				break;
			case 2:
				travels();
				break;
			case 3:
        			Hotels1.Hotelbooking();
				break;
			case 4:
				System.out.println(green+"Thanks for visiting"+reset);
				break;
		}
    }

    
    public static boolean validateCreditCard(String cardNumber)
    {
        return cardNumber.matches("\\d{16}");
    }

    
    public static boolean validateExpiryDate(String expiryDate)
    {
        return expiryDate.matches("^(0[1-9]|1[0-2])\\/\\d{2}$");
    }

    
    	public static boolean validateCVV(String cvv)
	{
        	return cvv.matches("\\d{3}");
	
	}
		/*System.out.println(green+"Enter your choice" +reset);
		System.out.println(teal+"1.Places in Hyderabad"+reset);
		System.out.println(teal+"2.Ticket Booking"+reset);
		System.out.println(teal+"3.Hotel Booking"+reset);
		System.out.println(teal+"4.Exit"+reset);

		int a=sc.nextInt();
		switch(a)
		{
			case 1:
				exploreDestinations();
				break;
			case 2:
				travels();
				break;
			case 3:
        			Hotels1.Hotelbooking();
				break;
			case 4:
				System.out.println(green+"Thanks for visiting"+reset);
				break;
		}*/

    
}

class Login extends TelanganaToHyderabadTravel
{
	/*static String orange = "\u001B[38;5;208m";
     	static String pink = "\u001B[38;5;205m";
     	static String teal = "\u001B[38;5;37m";
     	static String olive = "\u001B[38;5;58m";
     	static String maroon = "\u001B[38;5;88m";
	static String magenta="\u001B[35m";
	static final String def = "\u001b[0;1m";
   	static final String blink = "\u001b[5m";
    	static final String red =  "\u001b[31;1m";
    	static final String green = "\u001b[32;1m";
    	static final String yellow = "\u001b[33;1m";
    	static final String blue = "\u001b[34;1m";
   	static final String purpe = "\u001b[35;1m";
   	static final String skblue = "\u001b[36;1m";
   	static final String bgred =  "\u001b[101;1m";
   	static final String bggreen = "\u001b[102;1m";
   	static final String bgyellow = "\u001b[103;1m";
   	static final String bgblue = "\u001b[104;1m";
   	static final String bgpurpe = "\u001b[105;1m";
   	static final String bgskblue = "\u001b[106;1m";
	static String reset = "\u001B[0m";*/
	static Scanner sc = new Scanner(System.in);
   	static long getValidMobileNumber() 
	{
       		while (true) 
 		{
            		try 
	    		{
                		long mobileNumber = sc.nextLong();
                		if(mobileNumber >=6000000000L && mobileNumber <=9999999999L)
				{
                    			return mobileNumber;
                		} 
				else 
				{
                    			System.out.println(red+"***Invalid Mobile Number.Please enter a 10-digit mobilenumber***"+reset);
					return getValidMobileNumber();
               			}
            		} 
			catch (InputMismatchException e) 
			{
               	 		System.out.println(red+"*** Invalid input. Please enter numeric values only. ***"+reset);					
				String s = sc.next(); 
            		}
        	}
    	}
	static String otp()
	{
		int otp;
        	int value;
        	do 
		{
            		value = (int) (Math.random() * 9000) + 1000;
            		System.out.println(teal+"Your OTP: " + value);
            		System.out.println("Enter your OTP:");
            		otp = sc.nextInt();
            		if (value != otp)
	    		{
                		System.out.println(red+"Incorrect OTP.\nPlease try again."+reset);
            		}
        	} 
		while (value != otp); 
		return "Login Successful";
	}
	
}

class Date extends Login
{
    static Scanner sc = new Scanner(System.in);
    static int n; 
    static LocalDate checkInDate; 
    static LocalDate checkOutDate; 

    	static int date()
	{
        	LocalDate startDate = LocalDate.now(); 
        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE dd MMM");
        
        	for (int i = 0; i < 5; i++)
		{
            		LocalDate optionDate = startDate.plusDays(i);
            		System.out.println(teal+(i + 1) + ". " + optionDate.format(formatter)+reset);
            		System.out.println("");
        	}

        	System.out.println(green+"Enter Check-in Date (1-5):"+reset);

        	while (true)
		{
            		int checkInIndex = sc.nextInt(); 
            		if (checkInIndex >= 1 && checkInIndex <= 5)
			{
				//System.out.println("Stored Check-in Date: " + checkInDate); 
                		checkInDate = startDate.plusDays(checkInIndex - 1); 
                		System.out.println(green+"Enter Check-out Date (1-5):"+reset);
                		int checkOutIndex = sc.nextInt(); 
                		if (checkOutIndex >= 1 && checkOutIndex <= 5 && checkOutIndex >= checkInIndex)
				{
					//System.out.println("Stored Check-out Date: " + checkOutDate);
                    			checkOutDate = startDate.plusDays(checkOutIndex - 1); 
                    			n = checkOutIndex - checkInIndex + 1; 
                    			System.out.println(purpe+"Number of nights: " + n+reset);
                    			break;
                		}
				else
				{
                    			System.out.println("Enter the correct dates (1-5, and check-out should be after check-in)");
					Date.date();
                		}
            		}
			else
			{
                		System.out.println("Enter the correct dates (1-5 only)");
				Date.date();
            		}
			break;
        	}
        	return n;
    	}
}
class Roompayment extends Date
{
    static Scanner sc = new Scanner(System.in);
    static Roompayment pay = new Roompayment();
	 
    	public static void roomPayment(String roomType, int costPerNight, int nights)
	 {
		
        	int totalCost = costPerNight * nights;
        	System.out.println(teal+"Your total bill for " + roomType + " for " + nights + " night(s) is: Rs." + totalCost+reset);

        	System.out.println(green+"Select the App for payment:"+reset);
        	System.out.println(purpe+"1. PhonePe"+reset);
        	System.out.println(purpe+"2. GPay"+reset);
        	System.out.println(purpe+"3. Paytm"+reset);
        	int n5;

        	while(true)
		 {
           		 n5 = sc.nextInt();
            		if (n5 >= 1 && n5 <= 3) 
			{
               			 break;
            		}
			 else 
			{
                		System.out.println(green+"Invalid number. Please enter a correct value between 1 and 3."+reset);
            		}
        	}

        	switch (n5) 
		{
            		case 1:
                		phonepe(roomType, nights, totalCost);
                		break;
            		case 2:
                		gpay(roomType, nights, totalCost);
                		break;
            		case 3:
                		paytm(roomType, nights, totalCost);
                		break;
            		default:
                		System.out.println("Invalid selection.");
                		break;
        	}
    	}

   	 public static void phonepe(String roomType, int nights, int totalCost) 
	{
       		 System.out.println(teal+"Your payment is under process..."+reset);
        	System.out.println(teal+"Successfully paid!"+reset);
        	System.out.println(teal+"You have won a cashback of Rs.25."+reset);
        	displayBookingDetails(roomType, nights, totalCost);
    	}

    	public static void gpay(String roomType, int nights, int totalCost)
	{
        	System.out.println(teal+"Your payment is under process..."+reset);
        	System.out.println(teal+"Successfully paid!"+reset);
        	System.out.println(teal+"You have won a cashback of Rs.25."+reset);
        	displayBookingDetails(roomType, nights, totalCost);
    	}

    	public static void paytm(String roomType, int nights, int totalCost)
	{
       		System.out.println(teal+"Your payment is under process..."+reset);
        	System.out.println(teal+"Successfully paid!"+reset);
        	System.out.println(teal+"You have won a cashback of Rs.25."+reset);
        	displayBookingDetails(roomType, nights, totalCost);
    	}

    	public static void displayBookingDetails(String roomType, int nights, int totalCost)
	{
        	System.out.println(green+"\nYour Room is booked!"+reset);
		System.out.println(" ---------------------------------------------------------");
        	System.out.println("|"+"Room Type: " + roomType+"                                    |");
		System.out.println("|---------------------------------------------------------|");
        	System.out.println("|"+"Check-in Date: " + checkInDate+"                                |");
        	System.out.println("|"+"Check-out Date: " + checkOutDate+"                               |");
		System.out.println("|---------------------------------------------------------|");
        	System.out.println("|"+"Number of Nights: " + nights+"                                      |");
        	System.out.println("|"+"Total Bill: Rs." + totalCost+"                                       |");
		System.out.println(" ---------------------------------------------------------");
        	System.out.println("Thanks for visiting.");
		System.out.println(green+"Enter your choice"+reset);
		System.out.println(teal+"1.Places in Hyderabad"+reset);
		System.out.println(teal+"2.Ticket Booking"+reset);
		System.out.println(teal+"3.Hotel Booking"+reset);
		System.out.println(teal+"4.Exit"+reset);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
				exploreDestinations();
				break;
			case 2:
				travels();
				break;
				
			case 3:
        			Hotels1.Hotelbooking();
				break;
			case 4:
				System.out.println(green+"Thanks for visiting"+reset);
				break;
		}

		
    	} 
}

class Hotels1 extends Roompayment
{
    static Scanner sc = new Scanner(System.in);
    static Hotels1 hotel = new Hotels1();

    	public static void Hotelbooking()
	{
        	System.out.println(blink+purpe+"----------------WELCOME TO HYDERABAD HOTELS----------------"+reset);
		System.out.println(purpe+"|                                                         |"+reset);
       		System.out.println(purpe+"|Choose a hotel displayed on the portal:                  |"+reset);
        	System.out.println(purpe+"|1. Hotel Tara International                              |"+reset);
		System.out.println(purpe+"|2. The Golkonda Hotel                                    |"+reset);
		System.out.println(purpe+"|3. Taj Falaknuma Palace                                  |"+reset);
                System.out.println(purpe+"|4. Nova Pride                                            |"+reset);
		System.out.println(purpe+"|5. Ella Hotel                                            |"+reset);
		System.out.println(purpe+"|6. Hotel Bhavani                                         |"+reset);
		System.out.println(purpe+"|                                                         |"+reset);
		System.out.println(blink+purpe+" ---------------------------------------------------------"+reset);
        	System.out.println(green+"Enter the hotel serial number:"+reset);
        	int n1 = sc.nextInt();

        	boolean validSelection = false;
        	while (!validSelection)
		{
            		if (n1 >= 1 && n1 <= 6)
			{
                		switch (n1)
				{
                    			case 1:
                        			System.out.println(teal+"-----------Welcome to Hotel Tara International------------"+reset);
                        			break;
                    			case 2:
                        			System.out.println(teal+"-----------Welcome to The Golkonda Hotel-----------"+reset);
                        			break;
                    			case 3:
                        			System.out.println(teal+"-----------Welcome to Taj Falaknuma Palace----------"+reset);
                        			break;
                    			case 4:
                        			System.out.println(teal+"-----------Welcome to Nova Pride------------"+reset);
                        			break;
                    			case 5:
                        			System.out.println(teal+"------------Welcome to Ella Hotel------------"+reset);
                        			break;
                    			case 6:
                        			System.out.println(teal+"-----------Welcome to Hotel Bhavani-----------"+reset);
                        			break;
                		}
                		validSelection = true;
                		Roombooking();
            		}
 			else
			{
                		System.out.println(green+"Enter a valid serial number:"+reset);
                		n1 = sc.nextInt();
            		}
        	}
    	}
	public static void Roombooking()
	{
        	System.out.println(green+"Select and book your room:"+reset);
        	System.out.println(purpe+"1. Single Bed - Rs.899 per night"+reset);
        	System.out.println(purpe+"2. Double Bed - Rs.699 per night"+reset);
        	System.out.println(purpe+"3. Twin Beds - Rs.799 per night"+reset);
        	System.out.println(green+"Enter the required room type:"+reset);
        	int n2 = sc.nextInt();

        	switch (n2)
		{
            		case 1:
                		selectRoom("Single Bed", 899);
                		break;
            		case 2:
                		selectRoom("Double Bed", 699);
                		break;
            		case 3:
                		selectRoom("Twin Beds", 799);
                		break;
            		default:
                		System.out.println("Invalid selection. Please try again.");
                		Roombooking();
                		break;
        	}
    	}
	public static void selectRoom(String roomType, int costPerNight)
	{
        	System.out.println(teal+"Available " + roomType + " rooms:"+reset);
        	System.out.println(purpe+"1. Room 101\n2. Room 102"+reset);
        	System.out.println(green+"Enter room number:"+reset);
        	int roomNumber = sc.nextInt();
        	if (roomNumber == 1 || roomNumber == 2)
		{
            		System.out.println(purpe+"Enter the check-in and check-out dates"+reset);
            		int nights =hotel.date();
                	roomPayment(roomType, costPerNight, nights);
        	}
		else
		{
            		System.out.println("Invalid room number. Returning to room selection.");
            		Roombooking();
        	}
    	}

    	public static void main(String[] args)
	{
		System.out.println(blink+green+"*********************************************"+reset);
		System.out.println("|                                            |");
		System.out.println(teal+"|        Welcome to Hyderabad tourism        |"+reset);
		System.out.println("|                                            |");
		System.out.println(blink+green+"*********************************************"+reset);
		System.out.println(purpe+"Enter your Mobile Number:"+reset);
        	long mobileNumber = getValidMobileNumber();
        	System.out.println(purpe+"Valid Mobile Number: " + mobileNumber+reset);
		System.out.println(green+otp()+reset);
		System.out.println(green+"Enter your choice"+reset);
		System.out.println(teal+"1.Places in Hyderabad"+reset);
		System.out.println(teal+"2.Ticket Booking"+reset);
		System.out.println(teal+"3.Hotel Booking"+reset);
		System.out.println(teal+"4.Exit"+reset);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:
				exploreDestinations();
				break;
			case 2:
				travels();
				break;
			case 3:
        			hotel.Hotelbooking();
				break;
			case 4:
				System.out.println(green+"Thanks for visiting"+reset);
				break;
		}
				
    	}
}

package first;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PracicceSwitchStatements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#,###,###.00 Pesos");
        char passenger;
        double discount;
        char busClass;
        double busClassAdd = 0.0;
        double discRate = 0.0;
       
        System.out.print("Enter Discount for Ordinary Passenger: ");
        discount = scan.nextDouble();
        System.out.print("Business class additional Fare for Ordinary Passenger: ");
        double ordinaryBusClassAdd = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Enter Discount for Student Passenger: ");
        discount = scan.nextDouble();
        System.out.print("Business class additional Fare for Student Passenger: ");
        double studentBusClassAdd = scan.nextDouble();
        System.out.println(" ");
        System.out.print("Enter Discount for Senior Citizen Passenger: ");
        discount = scan.nextDouble();
        System.out.print("Business class additional Fare for Senior Citizen Passenger: 500");
        double seniorBusClassAdd = scan.nextDouble();
       

        System.out.print("Enter fare: ");
        double fare = scan.nextDouble();
        System.out.print("Passenger type [O,S,C]: ");
        passenger = scan.next().charAt(0);
        passenger = Character.toLowerCase(passenger);
        System.out.print("Travelling in business class [Y/N]: ");
        busClass = scan.next().charAt(0);
        busClass = Character.toLowerCase(busClass);
        
         
        switch(passenger)
            {
                case 'o':
                    discRate = 0;
                    
                    break;
                             
            switch(busClass)
                	{
                    case 'y':
                        {
                          busClassAdd = ordinaryBusClassAdd;
                        }
                        break;
                    case 'n':
                        {
                         ordinaryBusClassAdd = 0.0;
                        }
                        break;
                	}
                break;
                case 's': 
                    discRate = .05;
                    break;
                     switch(busClass)
                	{
                    case 'y':
                        {
                          busClassAdd = studentBusClassAdd;
                        }
                        break;
                    case 'n':
                        {
                         studentBusClassAdd = 0.0;
                        }
                        break;
                	}
                break;
                case 'c':
                    discRate = .1;
                    break;
                     switch(busClass)
                	{
                    case 'y':
                        {
                          busClassAdd = seniorBusClassAdd;
                        }
                        break;
                    case 'n':
                        {
                         seniorBusClassAdd = 0.0;
                        }
                        break;
                	}
                break;
           
                    //continue here the student and senior citizen
            }
                double totalFare = fare*discRate + busClassAdd;
                System.out.print("Discount: " + df.format(fare*discRate ));
                System.out.print("Business class charge:  ");
                System.out.println(" ");
                System.out.print("New fare:"+ df.format(totalFare) );


        
    }
}
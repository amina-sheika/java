import java.util.Scanner;

public class Delivery
{
    Delivery(String res_name, double lat, double lng)
    {
        System.out.println("You have to collect the package from "+res_name+ " "+String.valueOf(lat)+" "+String.valueOf(lng));
    }
    Delivery(double lat, double lng, String fname,String lname)
    {
        System.out.println("You have to deliver the package to "+fname+ " "+lname+" "+String.valueOf(lat)+" "+String.valueOf(lng));
    }
    
    public static void main(String[] args)
    {
        Delivery ob = new Delivery(23.345,23.678,"Amina "," Tho");

        
        
    }
    

}

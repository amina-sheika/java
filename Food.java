import java.util.*;

public class Food
{
    int foodId;
    String foodname;
    static String foodtype="Chineese";
    float price;
   
    public void viewitems()
    {
        System.out.println("\nFood Id : "+foodId);
        System.out.println("\nFood Name : "+foodname);
        System.out.println("\nFood Id : "+foodtype);
        System.out.println("\nPrice : "+price);
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        Food[] item = new Food[5];
        

        for(int i = 0; i<5 ; i++)
        {
            System.out.println("Enter food id");
            item[i].foodId = s.nextInt();
            System.out.println("Enter food name");

        }
        
    }
}



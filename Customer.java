import java.sql.Date;
import java.util.*;

public class Customer
{
    int ph_no;
    String name;
    String address;//instance variables
    int orderid;
    String deliveryInstructions;
    String addon;
    
    
    protected void CustomerDetails()
    {
        System.out.println("\nid " + ph_no);
        System.out.println("\nname " + name);
        System.out.println("\naddress " + address);
        System.out.println("\norderid " + orderid);
        System.out.println("\ndeliveryinstructions " + deliveryInstructions);

        
    }
    public void Deliverynotes()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Type delivery notes....\n");
        deliveryInstructions=s.next();
    }

    
  


    public static void main(String[] args)
    {
        int ch;
        Customer ob = new Customer(); //Initialize the object using reference variable
        Scanner sc = new Scanner(System.in);
          System.out.println("1: Customer details");
          System.out.println("2: View LoginInfo");
          System.out.println("3: Edit Delivery instructions");

          System.out.println("0: EXIT");

            lp : while(true) // labeling the while loop
            {
                System.out.print("Make your choice: ");  
                ch = sc.nextInt(); // reading user's choice
                switch (ch)
                {
                    case 1: System.out.println("Enter name");
                            ob.name = sc.next();
                            System.out.println("Enter phoneno");
                            ob.ph_no = sc.nextInt();
                            System.out.println("Enter address");
                            ob.address = sc.next();
                            System.out.println("Enter orderid");
                            ob.orderid= sc.nextInt();
                            ob.Deliverynotes();
                            break;
                    case 2: ob.CustomerDetails();
                            break;
                    case 3: editDeliverynotes ed = new editDeliverynotes();
                            ed.createclass();
                            break;
                    case 0: break lp; // exiting from the switch-case as well as from the while loop using its label lp

                    default: System.out.println("Invalid choice! Please make a valid choice.");
                            

                        

                }
            }
    }
    
}
class editDeliverynotes //ANONYMOUS CLASS
{
    public void createclass()
    {
        Customer temp = new Customer()
        {
            public void Deliverynotes()
            {
                
                
                Scanner a = new Scanner(System.in);
                System.out.println("Type delivery notes....\n");
                addon=a.next();
                System.out.println("add on instruction:"+addon);
            }
        };
        temp.Deliverynotes();
    }

}
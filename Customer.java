public class Customer
{
    int id;
    String name;
    String address;
    String password; //instance variables
    public void Register(int a,String b,String c,String d)
    {
        id= a;
        name= b;
        address = c;
        password = d;
        
    }
    protected void CustomerDetails()
    {
        System.out.println("\nid " + id);
        System.out.println("\nname " + name);
        System.out.println("\naddress " + address);
        
    }
    protected void PasswordDetails()
    {
	System.out.println("\nCREDENTIALS\n===========\nid "+id+"\npassword "+password);
    }
  


    public static void main(String[] args)
    {
        Customer ob = new Customer(); //Initialize the object using reference variable and method
        ob.Register(1,"aami","Banglore","amina123");
        ob.CustomerDetails();
	    ob.PasswordDetails();
	
        

    }
    
}
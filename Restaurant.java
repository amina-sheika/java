public class Restaurant
{
    static int workinghours=12;
    int id;
    String name;
    String location;
    
    Restaurant(int a,String b,String c)
    {
        id= a;
        name= b;
        location = c;
    }
    protected void viewdetails()
    {
        System.out.println("\nid " + id);
        System.out.println("\nname " + name);
        System.out.println("\nlocation " + location);
        System.out.println("\nWorking hours " +workinghours);
    }
    public void rating(int r)
    {
        
        for(int i=0;i<r;i++)
        {  
            System.out.print("*");
        }  
    }
public static void main(String args[])
{
    var rating=3;
    Restaurant[] rest = new Restaurant[5] ;
    rest[0]=new Restaurant(1,"pistachio","S G Palya");
    rest[1]=new Restaurant(2,"malabar cafe","S G Palya");
    rest[2]=new Restaurant(3,"Chicking","Koramangala");
    rest[3]=new Restaurant(4,"Kanur Food Point","S G Palya");
    rest[4]=new Restaurant(5,"K F C","Forum Mall");
    for(int i=0;i<5;i++)
    {
        rest[i].viewdetails();
    }
    System.out.println("\nRATING for "+rest[0].name);

    rest[0].rating(rating);
}
}

// Product[] obj = new Product[5] ;  
// //create & initialize actual product objects using constructor  
// obj[0] = new Product(23907,"Dell Laptop");  
// obj[1] = new Product(91240,"HP 630");  
// obj[2] = new Product(29823,"LG OLED TV");  
// obj[3] = new Product(11908,"MI Note Pro Max 9");  
// obj[4] = new Product(43590,"Kingston USB");
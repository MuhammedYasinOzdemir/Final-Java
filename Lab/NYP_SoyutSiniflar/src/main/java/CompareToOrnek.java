import java.util.Date;
public class CompareToOrnek {
    public static void main(String[] args) {
    System.out.println(new Integer(8).compareTo(new Integer(4)));   
    System.out.println("ABC".compareTo("ABE"));    
    Date date1 = new Date(2014, 1, 1);    
    Date date2 = new Date (2015, 1, 1);    
    System.out.println(date1.compareTo(date2)); 
    }
    

}
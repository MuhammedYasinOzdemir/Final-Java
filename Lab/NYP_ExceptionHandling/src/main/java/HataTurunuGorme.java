import java.util.*;
public class HataTurunuGorme {

 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
    
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
  
        // Display the result
        System.out.println("The number entered is " + number);
        
        continueInput = false;
      
      
    } while (continueInput);
  }
}
    


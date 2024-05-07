package TASK1;
import java.util.Scanner;

public class reversenumber {
	public static void reverseNumber(int number)   
    {  
        if (number < 10)   
        {  
            System.out.println(number);  
            return;  
        }  
        else   
        {  
            System.out.print(number % 10);  
            reverseNumber(number/10);  
        }  
    } 
    public static void main(String[] args) {
        //A Simple Hello World
        // System.out.println("hello, world");
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        reverseNumber(num);
        // System.out.println("The Input Provided is: " + userInput);
    }

}

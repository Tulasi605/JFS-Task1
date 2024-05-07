package TASK1;
import java.util.Scanner;
public class discount {
	public static void main(String[] args) {
        //A Simple Hello World
        // System.out.println("hello, world");
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        double amt = obj.nextInt();
        int discount=0;
        if(amt<500){
            discount=0;
        }
        else if(amt>500 && amt<1000){
            discount=10;
        }
        else{
            discount=20;
        }
        double discountamt = amt * discount/100;
        double finalamt = amt - discountamt;
        System.out.println("The final amount is: " + finalamt);
    }
}

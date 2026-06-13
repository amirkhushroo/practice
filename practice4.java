import java.util.Scanner;
public class practice4{
    public static void main(String[] args){
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
     
        System.out.println("Enter the another number :");
        int num1=sc.nextInt();

        System.out.println("Enter the operator that you want to perform (+, -, *, /):");
        String operator=sc.next();

    
        switch (operator) {
          case "+":
                System.out.println("the number is" +(num+num1));
                break;
            case "-":
                System.out.println("the number is "+(num-num1));
                break;                      
            case "*":
                System.out.println("the number is "+(num*num1)); 
                break;
            case "/":                  
                System.out.println("the number is "+(num/num1));  
                break;      
            default:
                System.out.println("Invalid operator"); 

        }

    }
}
//  public class pc2 {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// import java.util.Scanner;

// public class pc2{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);

//         System.out.println("Enter the  number :");
//         int num=sc.nextInt();

//         int original=num;
//         int reverse=0;

//         while(num !=0){
//             int digit=num%10;
//             reverse=reverse*10+digit;
//             num= num / 10;

//         }
//         if(original == reverse)
//             System.out.println(original+" is a palindrome number.");
        
//         else
//             System.out.println(original+" is not a palindrome number.");
//     }
// }

// import java.util.Arrays;
// public class pc2{
//     public static void main(String[] args){
//         int[] marks=new int[5];
//         marks[0]=85;
//         marks[1]=90;    
//         marks[2]=78;
//         marks[3]=92;   
//         marks[4]=88;
//         System.out.println(marks);
//         System.out.println("Marks of student 1: "+marks[3]);

//         Arrays.sort(marks);
//     }
// }

//   import java.util.Scanner;
//   public class pc2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter any number :");
//         int num=sc.nextInt();

//         int original=num;
//         int sum=0;
//         while(num!=0){
//             int digit=num%10;
//             sum=sum+(digit*digit*digit);
//             num=num/10;

//         }
//         if(original==sum)
//             System.out.println(original+" is an armstrong number.");
//         else
//             System.out.println(original+" is not an armstrong number.");
//     }
//     }

// import java.util.Scanner;

// public class pc2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         while (true) {
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int original = num;
//         int sum = 0;

//         for(;num != 0; num = num / 10) {
//             int digit = num % 10;
//             sum = sum + (digit * digit * digit);
//         }

//         if(sum == original){

//             System.out.println("Armstrong Number");
//          break;
// }
//         else{ 
//             System.out.println("Not an Armstrong Number");
//         }
//         }
    
//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
       
//         while (true) {
//             System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean prime = true;

//         if(num <= 1)
//             prime = false;

//         for(int i = 2; i <= num / 2; i++) {
//             if(num % i == 0) {
//                 prime = false;
//                 break;
//             }
//         }
        

//         if(prime){ 
//             System.out.println("Prime Number");
//             break;
//         }
//         else{ 
//             System.out.println("Not Prime Number");
//         }
//     }
// }
//     }

// import java.util.Scanner;

// public class pc2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);

//         while(true){

//         System.out.print("Enter any alphabet :");
//         char ch = sc.next().charAt(0);

//         if(ch >= 'a' && ch <= 'z') {
        
//             System.out.println(ch+" is in lowercase.");
//             break;
//         }

//             else if(ch >= 'A' && ch <= 'Z'){ 
//             System.out.println(ch+" is in uppercase.");
//             break;
//             }
//         else{ 
//             System.out.println(ch+" is not an alphabet.");
//         }
//     }
// }
// }

import java.util.Scanner;

public class pc2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of student 1:");
        int marks=sc.nextInt();

        if(marks >= 90)
            System.out.println("Grade: A");
        else if(marks >= 80)
            System.out.println("Grade: B");
        else if(marks >= 70)
            System.out.println("Grade: C");
        else if(marks >= 60)
            System.out.println("Grade: D");
        else
            System.out.println("Grade: F");
    }
}
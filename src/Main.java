import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    System.out.println("Enter two numbers");
    Scanner scanner = new Scanner(System.in);

    String snum1 = scanner.next();
    String snum2 = scanner.next();

    int num1 = Integer.parseInt(snum1);
    int num2 = Integer.parseInt(snum2);

    if(num1 > num2){
        System.out.println("The largest number is " + num1);
    }else if(num1 < num2){
        System.out.println("The largest number is " + num2);
    }else{
        System.out.println("The numbers are equal");
    }
    }
}
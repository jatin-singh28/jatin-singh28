
import java.util.*;
public class Calc_Switch{
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.printf("Enter the first Number-");
        int a=Sc.nextInt();
        System.out.printf("Enter the Second Number-");
        int b=Sc.nextInt();
        System.out.printf("Enter Operator");
        char operator =Sc.next().charAt(0);Sc.close();
        
        switch(operator){
            case '+':
            System.out.printf("Result-");
            System.out.println(a+b);break;
            case '-':
            System.out.printf("Result-");
            System.out.println(a-b);break;
            case '*':
            System.out.printf("Result-");
            System.out.println(a*b);break;
            case '/':
            System.out.printf("Result-");
            System.out.println(a/b);break;
            case '%':
            System.out.printf("Result-");
            System.out.println(a%b);break;
            default:
            System.out.println("ERROR");
 }
}
}

import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.printf("Enter the  Number-");
        int num=Sc.nextInt();
        Sc.close();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
          factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}

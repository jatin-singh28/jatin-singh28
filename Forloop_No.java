import java.util.*;
public class Forloop_No{
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        System.out.printf("Enter the  Number-");
        int num=Sc.nextInt();
        Sc.close();
        int i;
       
       for (i=1;i<=num;i++)
        System.out.println(i);
    }
}

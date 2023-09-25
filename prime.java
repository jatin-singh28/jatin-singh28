import java.util.*;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("n is prime number");
        }
        else{
            System.out.println("n is not a prime number");
        }
        sc.close();
    }
}

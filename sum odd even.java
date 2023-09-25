import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

       
        long oddSum = 0;
        long evenSum = 0;
        int position = 1;
        while (N > 0) {
            long digit = N % 10; 
            if (position % 2 == 1) {
              oddSum += digit;
            } 
            else {
               evenSum += digit;
            }
            N /= 10; 
            position++;
        }

       
        System.out.println(oddSum);
        System.out.println(evenSum);

        sc.close();
    }
}

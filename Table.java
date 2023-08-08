import java.util.*;
class Table{
    public static void main(String[] args)
    {
        Scanner Sc = new Scanner (System.in);
        System.out.printf("Enter the  Number-");
        int N = Sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = "+ N * i);
        }
    }
}

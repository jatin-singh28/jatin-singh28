import java.util.*;
public class Simpleinput {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true){
			int num = sc.nextInt();
			sum += num;
			if(sum<0){
				break;
			}
			System.out.println(num);
		}
        sc.close();
    }
}

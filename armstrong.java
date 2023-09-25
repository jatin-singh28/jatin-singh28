import java.util.Scanner;
class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,z,count=0,digit,i,pro=1,sum=0;
        System.out.println("Enter the number to check=");
        n = sc.nextInt();
        z = n;
        //for counting 
        while(z>0){
            count = count+1;
            z = z/10;
        }
        System.out.println("Number of digits ="+count);
        z=n;
        while(z>0){
            digit = z%10;
            for(i=1;i<=count;i++)
            pro = pro*digit;
            sum=sum+pro;
            z=z/10;
        }  
        if(sum==n)
        System.out.println("Armstrong");
        else
        System.out.println("Not Armstrong");
    }
}

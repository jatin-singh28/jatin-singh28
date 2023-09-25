public class Bintodec {
    public static void binaryToDecimal(int binNum) {
        int pow = 0;
        int decNum = 0;
        
        
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (int) (lastDigit * Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        
        System.out.println("The decimal number of " + binNum + " is " + decNum);
    }

    public static void main(String[] args) {
        binaryToDecimal(10111);
    }
}

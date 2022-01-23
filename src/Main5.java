import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        System.out.println("give me three digit number pls");
        num = s.nextInt();
        int result = fastnum(num);
        if(result > 0)
            System.out.println("true");
        else
            System.out.println("false");


        while (num != 999) {
            System.out.println("give me three digit number pls");
            num = s.nextInt();
            result = fastnumwhile(num);
            if(result > 0)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
    public static int fastnum(int num){
        int num12;
        int num2;
        int num3;
        int result = 0;
        num12 = num;
        num2 = num%10;
        num3 = (num/10)%10;
        num = num/100;
        if(num > num3 && num3 > num2)
            return result = 1;
        else
            return result = 0;
    }
    public static int fastnumwhile(int num){
        int num12;
        int num2;
        int num3;
        int result = 0;
        num12 = num;
        num2 = num%10;
        num3 = (num/10)%10;
        num = num/100;
        if(num > num3 && num3 > num2)
            return result = 1;
        else
            return result = 0;
    }
}
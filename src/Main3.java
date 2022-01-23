import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give me any positive number you want or zero pls");
        int num = s.nextInt();
        int result = power3(num);
        System.out.println(result);
        System.out.println("give me three digit number pls");
        num = s.nextInt();
        result = shilus(num);
        if(result > 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static int power3(int num){
        int result = (int)Math.pow(num,2);
        return result;

    }
    public static int shilus(int num){
        int num12;
        int num2;
        int num3;
        int result = 0;
        num12 = num;
        num2 = num%10;
        num3 = (num/10)%10;
        num = num/100;
        if(Math.pow(num2,3) + Math.pow(num3,3) + Math.pow(num,3) == num12)
            return result = 1;
        else
            return result = 0;

    }
}
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("give me any number you want");
        int num1 = s.nextInt();
        numbers(num1);
    }

    public static void numbers(int num1) {
        int num3 = 0;
        int num2 = (num1)%10;
        num1 = num1/10;
        num2++;
        num3 = num3 + num2;
        while (num1 > 0){
            num2 = (num1)%10;
            num1 = num1/10;
            num2++;
            int num4 = 10;
            int num5 = (num2 * num4) + num3;
            num4 = num4 * 10;
            System.out.println(num5);
        }

    }
}

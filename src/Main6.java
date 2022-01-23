import java.util.*;
public class Main6
{
    public static void main(String[] args){
        int result = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("give me any number you want pls");
        int num = s.nextInt();
        result = plusone(num);
        num = num/10;
        System.out.println(result +""+ num);
        for (int i = 0; i < 10; i++) {
            num = (int)(Math.random()*(139 - 45)+46);
            System.out.println("first: " + num);
            result = randomnum(num);
            num = num/10;
            System.out.println("second: " + result +""+ num);
        }
    }
    public static int plusone(int num){
        int result = 0;
        result = num%10;
        return result;

    }
    public static int randomnum(int num){
        int result = 0;
        result = num%10;
        return result;
    }
}



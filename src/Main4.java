import java.util.*;
public class Main4
{
    public static void main(String[] args){
        int finalnum = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("give me any number you want pls");
        int num = s.nextInt();
        finalnum = plusone(num);
        System.out.println(finalnum);
    }
    public static int plusone(int num){
        int y = 0;
        int z = 1;
        int a = 1;
        while (num > 0){
            a = num % 10;
            if (a < 9)	{
                y = y + (((num % 10)+1)*z);
                z = z*10;
                num = num/10;
            }
            else{
                y = y + (((num % 10)*0)*z);
                z = z*10;
                num = num/10;
            }
        }
        return y;
    }
}



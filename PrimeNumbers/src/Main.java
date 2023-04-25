import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range:");
        int range;
        range = scanner.nextInt();
        System.out.println("Prime numbers between 2 and " + range + " are:");
        for(int num = 2; num < range; num++)
        {
            boolean isPrime = true;
            for(int div = 2; div < num; div++ )
            {
                if(num % div == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(num);
            }
        }
    }
}
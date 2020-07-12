/*4)Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number A:");
        int A=input.nextInt();
        System.out.println("Input number B:");
        int B=input.nextInt();
        input.close();
        int result=0;
        if(B<0) {
            for (int i = 0; i > B; i--) {
                result -= A;
            }
        }
        else
        {
            for (int i = 0; i < B; i++) {
                result += A;
            }
        }
        System.out.println("A*B is "+ result);
    }
}

/*
*Вычислить: 1+2+4+8+...+256*/

public class Task_3 {
    public static void main(String [] args)
    {
        int result = 0;
        for(int i=1;i<=256;i*=2)
        {
            result +=i;
        }
        System.out.println(result);
    }
}

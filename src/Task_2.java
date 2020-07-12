/*Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class Task_2 {
    public static void main(String [] args)
    {
        int timer=3;
        int amoubas=1;
        for(;timer<=24;)
        {
            amoubas*=2;
            System.out.println("Через "+ timer+" ч. будет "+amoubas+" амёб(ы)");
            timer+=3;
        }
    }
}
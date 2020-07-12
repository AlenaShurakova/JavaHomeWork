/*
Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.
* */
public class Task_9_M {
    public static void main (String [] args)
    {
        double averageFactorial = 0;
        double factorial = 1;
        int n = 0;
        int x = (int)(Math.random() * 20);
        while(x != 0) {
            factorial *= x;
            n ++;
            x = (int)(Math.random()*20);
        }
        if(n != 0){
            averageFactorial = factorial / n;
        } else {
            averageFactorial = 0;
        }
        System.out.println("среднее:" + averageFactorial);
    }
}

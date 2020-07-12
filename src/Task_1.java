/*
* Начав тренировки, спортсмен в первый день пробежал 10 км. Каждыйдень он увеличивал дневную норму на 10% нормы
*  предыдущего дня. Какойсуммарный путь пробежит спортсмен за 7 дней?
* */

public class Task_1 {
    public static void main(String [] args)
    {
        int numberOfDays=7;
        double numberOfKm=10;
        double totalNumberOfKm=10;
        for(int i = 2;i<=numberOfDays;i++)
        {
            numberOfKm*=1.1;
            totalNumberOfKm+=numberOfKm;
        }
        System.out.println(totalNumberOfKm);
    }
}

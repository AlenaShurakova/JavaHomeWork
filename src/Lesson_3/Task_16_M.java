package Lesson_3;

/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
* */
public class Task_16_M {
    public static void main(String args[]) {
        int sizeOfMassive =0;
        while (sizeOfMassive==0) {
            sizeOfMassive=(int) (Math.random() * 10);
        }
        int [] massive = new int [sizeOfMassive];
        for (int i = 0; i<massive.length;i++)
        {
            massive[i]=(int) (Math.random() * 100);
        }
        int max=0;
        int min=0;
        int maxIndex=0;
        int minIndex=0;
        for (int i = 0; i < massive.length; i++) {
            int counterMax = 0;
            int counterMin=0;
            for (int j=0;j<massive.length;j++) {
                if(massive[i]>=massive[j])
                {
                    counterMax++;
                }
            }
            for (int j=0;j<massive.length;j++) {
                if(massive[i]<=massive[j])
                {
                    counterMin++;
                }
            }
            if (counterMax==sizeOfMassive)
            {
                max=massive[i];
                maxIndex=i+1;
            }
            if (counterMin==sizeOfMassive)
            {
                min=massive[i];
                minIndex=i+1;
            }
        }
        System.out.println("Массив состоит из следующий оценок: ");
        for (int i=0; i<massive.length;i++)
        {
            System.out.print(massive[i]+ " ");
        }
        System.out.println("\nМаксимальная оценка: " +max +", ее номер:"+maxIndex);
        System.out.println("Минимальная оценка: " +min +", ее номер:"+minIndex);
        int sumOfElements=0;
        if (minIndex+1<maxIndex){
            for (int i=minIndex;i<maxIndex-1;i++)
            {
                sumOfElements+=massive[i];
            }
            System.out.println("Сумма элементов между максимальным и минимальным элементами равна: "+ sumOfElements);
        }
        else if (minIndex>maxIndex+1)
        {
            for (int i=maxIndex;i<minIndex-1;i++)
            {
                sumOfElements+=massive[i];
            }
            System.out.println("Сумма элементов между максимальным и минимальным элементами равна: "+ sumOfElements);
        }
        else {
            System.out.println("Между максимальным и минимальным элементами нет других элементов");
        }
    }
}


package lesson_6;

/*
* Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
снимающую деньги. На вход передается сумма денег. На выход – булевское
значение (операция удалась или нет). При снятии денег функция должна
рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
конструктор с тремя параметрами – количеством купюр.*/

import java.util.Scanner;

public class Task_25 {
    public static void main(String[] args) {
        ATM belarussBankATM = new ATM(10, 1, 0);
        boolean isATMworks = true;
        while (isATMworks) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите код операции: 1 - Добавление денег 2 - Снятие денег");
            int operationCode = scanner.nextInt();
            if (operationCode == 1) {
                System.out.println("Введите количество банкнот номиналом 20:");
                int banknote20 = scanner.nextInt();
                System.out.println("Введите количество банкнот номиналом 50:");
                int banknote50 = scanner.nextInt();
                System.out.println("Введите количество банкнот номиналом 100:");
                int banknote100 = scanner.nextInt();
                if (banknote20 < 0 || banknote50 < 0 || banknote100 < 0) {
                    System.out.println("Количество банкнот не может быть отрицательным числом!");
                } else {
                    belarussBankATM.putMoney(banknote20, banknote50, banknote100);
                }
            } else if (operationCode == 2) {
                System.out.println("Введите сумму для снятия денег");
                int sum = scanner.nextInt();
                if (sum <= 0) {
                    System.out.println("Сумма должна быть больше 0");
                } else if (belarussBankATM.withDrawMoney(sum)) {
                    System.out.println("Деньги успешно списаны");
                } else {
                    System.out.println("Что-то пошло не так...");
                }
            } else {
                System.out.println("Введен неверный код операции.");
            }
            scanner.close();
        }
    }
}

class ATM {
    int banknote20;
    int banknote50;
    int banknote100;

    public ATM(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public void putMoney(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
        System.out.println("Зачисление произошло успешно!");
    }

    public boolean withDrawMoney(int sum) {
        int banknote20ToBeWithdrawed = 0;
        int banknote50ToBeWithdrawed = 0;
        int banknote100ToBeWithdrawed = 0;

        if ((banknote100ToBeWithdrawed = sum / 100) <= banknote100) {
            sum -= banknote100ToBeWithdrawed * 100;
        }
        if ((banknote50ToBeWithdrawed = sum / 50) <= banknote50) {
            sum -= banknote50ToBeWithdrawed * 50;
        }
        if ((banknote20ToBeWithdrawed = sum / 20) <= banknote20) {
            sum -= banknote20ToBeWithdrawed * 20;
        }
        if (sum == 0) {
            banknote100 -= banknote100ToBeWithdrawed;
            banknote50 -= banknote50ToBeWithdrawed;
            banknote20 -= banknote20ToBeWithdrawed;
            return true;
        } else
            return false;
    }
}
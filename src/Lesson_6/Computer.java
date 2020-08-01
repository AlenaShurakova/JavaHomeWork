package Lesson_6;

import java.util.Scanner;

class AsusComputer {
    public static void main(String[] args) {
        Computer asusComputer = new Computer("Intel Core i7", 4, 504, 5);
        while (asusComputer.WorkingCircleResourse != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите код операции, которую хотите выполнить: 1 - включить компьютер, 2 - выключить компьютер, 3 - вывести информацию о компьютере");
            int inputtedOperationCode = scanner.nextInt();
            if (inputtedOperationCode == 3) {
                asusComputer.ComputerDescription();
            } else if (inputtedOperationCode == 1 || inputtedOperationCode == 2) {
                if (inputtedOperationCode == 1 && !asusComputer.IsComputerOn) {
                    asusComputer.TurnOnComputer();
                } else if (inputtedOperationCode == 1 && asusComputer.IsComputerOn) {
                    System.out.println("Компьютер уже включен!");
                } else if (inputtedOperationCode == 2 && asusComputer.IsComputerOn) {
                    asusComputer.TurnOffComputer();
                } else if (inputtedOperationCode == 2 && !asusComputer.IsComputerOn) {
                    System.out.println("Компьютер уже выключен!");
                }
            } else {
                System.out.println("Вы ввели некорретный код!");
            }
        }
        if (asusComputer.WorkingCircleResourse == 0) {
            System.out.println("Компьютер сломался!");
        }
    }
}

class Computer {
    //процессор
    String CPU;
    //Оперативная память
    int RAM;
    //Объем жесткого диска МБ
    int HDD;
    //Ресурс полных циклов работы
    int WorkingCircleResourse;
    boolean IsComputerOn = false;

    public Computer(String CPU, int RAM, int HDD, int WorkingCircleResource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.WorkingCircleResourse = WorkingCircleResource;
    }

    public void ComputerDescription() {
        System.out.println("Процессор: " + this.CPU + ", Оперативная память (ГБ): " + this.RAM + ", Жесткий диск (МБ): " + this.HDD + ", Оставшийся ресурс полных циклов работы: " + this.WorkingCircleResourse);
    }

    public void TurnOnComputer() {
        System.out.println("Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int inputtedValue = scanner.nextInt();
        if (inputtedValue != 1 && inputtedValue != 0) {
            System.out.println("Вы ввели некорректное число");
            return;
        }
        int randomValue = (int) (Math.random() * 2);
        if (inputtedValue == randomValue) {
            System.out.println("Включение прошло успешно!");
            IsComputerOn = true;
        } else {
            System.out.println("Ууупс... Произошел сбой...");
            this.WorkingCircleResourse--;
        }
    }

    public void TurnOffComputer() {
        System.out.println("Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int inputtedValue = scanner.nextInt();
        if (inputtedValue != 1 && inputtedValue != 0) {
            System.out.println("Вы ввели некорректное число");
            return;
        }
        int randomValue = (int) (Math.random() * 2);
        if (inputtedValue == randomValue) {
            System.out.println("Выключение прошло успешно!");
            IsComputerOn = false;
        } else {
            System.out.println("Ууупс... Произошел сбой...");
            this.WorkingCircleResourse--;
        }
    }
}

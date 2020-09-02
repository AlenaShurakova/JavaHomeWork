package lesson_6;

import java.util.Scanner;

class AsusComputer {
    public static void main(String[] args) {
        Computer asusComputer = new Computer("Intel Core i7", 4, 504, 5);
        while (asusComputer.workingCircleResourse != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите код операции, которую хотите выполнить: 1 - включить компьютер, " +
                    "2 - выключить компьютер, 3 - вывести информацию о компьютере");
            int inputtedOperationCode = scanner.nextInt();
            if (inputtedOperationCode == 3) {
                asusComputer.computerDescription();
            } else if (inputtedOperationCode == 1 || inputtedOperationCode == 2) {
                if (inputtedOperationCode == 1 && !asusComputer.isComputerOn) {
                    asusComputer.turnOnComputer();
                } else if (inputtedOperationCode == 1 && asusComputer.isComputerOn) {
                    System.out.println("Компьютер уже включен!");
                } else if (inputtedOperationCode == 2 && asusComputer.isComputerOn) {
                    asusComputer.turnOffComputer();
                } else if (inputtedOperationCode == 2 && !asusComputer.isComputerOn) {
                    System.out.println("Компьютер уже выключен!");
                }
            } else {
                System.out.println("Вы ввели некорретный код!");
            }
        }
        if (asusComputer.workingCircleResourse == 0) {
            System.out.println("Компьютер сломался!");
        }
    }
}

class Computer {
    //процессор
    String cpu;
    //Оперативная память
    int ram;
    //Объем жесткого диска МБ
    int hdd;
    //Ресурс полных циклов работы
    int workingCircleResourse;
    boolean isComputerOn = false;

    public Computer(String cpu, int ram, int hdd, int workingCircleResource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.workingCircleResourse = workingCircleResource;
    }

    public void computerDescription() {
        System.out.println("Процессор: " + this.cpu + ", Оперативная память (ГБ): " + this.ram + ", Жесткий диск (МБ): "
                + this.hdd + ", Оставшийся ресурс полных циклов работы: " + this.workingCircleResourse);
    }

    public void turnOnComputer() {
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
            isComputerOn = true;
        } else {
            System.out.println("Ууупс... Произошел сбой...");
            this.workingCircleResourse--;
        }
    }

    public void turnOffComputer() {
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
            isComputerOn = false;
        } else {
            System.out.println("Ууупс... Произошел сбой...");
            this.workingCircleResourse--;
        }
    }
}

package lesson_7.robot;

import lesson_7.robot.hands.SamsungHand;
import lesson_7.robot.hands.SonyHand;
import lesson_7.robot.hands.ToshibaHand;
import lesson_7.robot.heads.SamsungHead;
import lesson_7.robot.heads.SonyHead;
import lesson_7.robot.heads.ToshibaHead;
import lesson_7.robot.legs.SamsungLeg;
import lesson_7.robot.legs.SonyLeg;
import lesson_7.robot.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        Robot robot1 = new Robot(new SamsungHead(200), new SonyHand(100), new ToshibaLeg(50));
        Robot robot2 = new Robot(new ToshibaHead(250), new SamsungHand(80), new SonyLeg(60));
        Robot robot3 = new Robot(new SonyHead(220), new ToshibaHand(90), new SamsungLeg(80));

        robot1.action();
        System.out.println();
        robot2.action();
        System.out.println();
        robot3.action();
        System.out.println();
        System.out.println("Цена робота #1: " + robot1.getPrice());
        System.out.println("Цена робота #2: " + robot2.getPrice());
        System.out.println("Цена робота #3: " + robot3.getPrice());

        int maxPrice = Math.max(robot3.getPrice(), Math.max(robot1.getPrice(), robot2.getPrice()));
        System.out.println("Самые дорогие роботы: ");
        if (robot1.getPrice() == maxPrice) {
            System.out.println("Робот #1");
        }
        if (robot2.getPrice() == maxPrice) {
            System.out.println("Робот #2");
        }
        if (robot3.getPrice() == maxPrice) {
            System.out.println("Робот #3");
        }
    }
}

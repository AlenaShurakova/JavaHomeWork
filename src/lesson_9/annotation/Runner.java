package lesson_9.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса (поле обязательное) MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).
Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы, переопределенные методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто печатать данные о самом классе (данные любые на ваш выбор), в котором он определен.
Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует - создавать экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).
* */
public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        inspectService(MyService.class);
    }
    public static void inspectService(Class<MyService> serviceClass) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if(serviceClass.isAnnotationPresent(Version.class)){
            MyService service = new MyService();
            service.setNumberOfUsers(100);
            service.setServiceName("Mobile app check");
            Method classInfoMethod = serviceClass.getDeclaredMethod("thisClassInfo", null);
            classInfoMethod.setAccessible(true);
            classInfoMethod.invoke(service, null);
        }
        else {
            System.out.println("Annotation Version is absent for the class");
        }
    }
}
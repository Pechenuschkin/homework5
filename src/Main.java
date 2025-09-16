//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача № 1 ");
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке ");
        } else if (clientOS == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println(" Такой операционной системы нет ");
        }
        System.out.println();
        System.out.println(" Задача № 2 ");
        var clientOS1 = 1;
        int clientDeviceYear = 2005;
        String operationSystem = " operationSystem ";
        if (clientOS1 == 0) {
            operationSystem = "iOS";
        } else if (clientOS1 == 1) {
            operationSystem = "Android";
        } else {
            System.out.println(" Такой операционной системы нет ");
            return;
        }
        if (clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для " + operationSystem + " по ссылке ");
        } else if (clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для " + operationSystem + " по ссылке ");
        }
        System.out.println();
        System.out.println(" Задача № 3 ");
        int year = 1584;

        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным ");
        } else if (year < 1584) {
            System.out.println(" Високосный год был введён в 1584 году ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
        System.out.println();
        System.out.println(" Задача № 4 ");
        int deliveryDistance = 99;
        int deliveryDay = 1;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            deliveryDay = 1;
            System.out.println(" На доставку потребуются " + deliveryDay + " сутки ");
        } else if (deliveryDistance < 60) {
            deliveryDay += 1;
            System.out.println(" На доставку потребуются " + deliveryDay + " суток ");
        } else if (deliveryDistance <= 100) {
            deliveryDay += 2;
            System.out.println(" На доставку потребуются " + deliveryDay + " суток ");
        } else {
            System.out.println(" Доставки нет ");
        }
        System.out.println();
        System.out.println(" Задача № 5 ");
        int monthNumber = 8;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зимний месяц ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весенний месяц ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Летний месяц ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осенний месяц ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");
        }

    }
}

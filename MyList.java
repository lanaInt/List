package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        int numOperation = 5;
        while (numOperation > 0) {
            listSelectOperations();
            System.out.print("Ваш выбор: ");
            String select = scanner.nextLine();
            numOperation = Integer.parseInt(select);
            switch (numOperation) {
                case 0: break;
                case 1: System.out.print("Введите название задачи: ");
                    String operation = scanner.nextLine();
                    myList.add(operation);
                    System.out.println("Добавлено!");
                    PrintMyList(myList);
                    break;
                case 3: System.out.println("Введите номер для удаления: ");
                    select = scanner.nextLine();
                    int numDel = Integer.parseInt(select);
                    if (numDel > myList.size()) {
                        System.out.println("Нет дела с таким номером!");
                    } else {
                        myList.remove(numDel - 1);
                        System.out.println("Удалено!");
                    };
                    PrintMyList(myList);
                    break;
                case 4: System.out.println("Введите задачу для удаления: ");
                    select = scanner.nextLine();
                    int sizeList = myList.size();
                    for (int i = 0; i < sizeList; i++) {
                        if (myList.get(i).equals(select)) {
                            myList.remove(i);
                            System.out.println("Удалено!");
                            break;//Дела можно считать уникальными по условию задачи
                        }
                    }
                    if (sizeList == myList.size()) {
                        System.out.println("Не найдено таких задач");
                    };
                    PrintMyList(myList);
                    break;
                default: PrintMyList(myList);
                    break;
            }
        }
    };

    public static void PrintMyList (ArrayList<String> myList) {
        if (myList.isEmpty()) {
            System.out.println("Список дел пустой");
        } else {
            System.out.println("Ваш список дел:");
            for (int i = 0; i < myList.size(); i++) {
                System.out.println((i + 1) + ". " + myList.get(i));
            }
            System.out.println();
        };
    }
    public static void listSelectOperations() {
        System.out.println("Выберите операцию:\n" +
                "\n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию");
    }
}

package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            listSelectOperations();
            System.out.print("Ваш выбор: ");
            String select = scanner.nextLine();
            int numOperation = Integer.parseInt(select);
            if (numOperation == 0) {
                break;
            }
            if (numOperation == 1) {
                System.out.print("Введите название задачи: ");
                String operation = scanner.nextLine();
                list.add(operation);
                System.out.println("Добавлено!");
                numOperation = 2;
            }
            if (numOperation == 3) {
                System.out.println("Введите номер для удаления: ");
                select = scanner.nextLine();
                int numDel = Integer.parseInt(select);
                if (numDel > list.size()) {
                    System.out.println("Нет дела с таким номером!");
                } else {
                    list.remove(numDel - 1);
                    System.out.println("Удалено!");
                }
                numOperation = 2;
            }
            if (numOperation == 4) {
                System.out.println("Введите задачу для удаления: ");
                select = scanner.nextLine();
                int sizeList = list.size();
                for (int i = 0; i < sizeList; i++) {
                    if (list.get(i).equals(select)) {
                        list.remove(i);
                        System.out.println("Удалено!");
                        break;//Дела можно считать уникальными по условию задачи
                    }
                }
                if (sizeList == list.size()) {
                    System.out.println("Не найдено таких задач");
                }
                numOperation = 2;
            }
            if (numOperation == 2) {
                if (list.isEmpty()) {
                    System.out.println("Список дел пустой");
                } else {
                    System.out.println("Ваш список дел:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                }
            }
        }
    };

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

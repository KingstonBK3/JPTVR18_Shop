/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_shop;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
     public void run() {
        System.out.println("Продуктовый магазин");
        boolean repeat = true;
        do {
            System.out.println("0. Выход из программы.");
            System.out.println("1. Создание продута.");
            System.out.println("2. Создание покупателя.");
            System.out.println("3. Приобрести продукт.");
            System.out.println("4. Список всех товаров.");
            System.out.println("5. Список всех пользователей.");
            System.out.println("6. Подсчет прибыли магазиа за все время работы.");
            System.out.println("Выберите задачу: ");
            repeat = true;
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Закрытие программы");
                    repeat = false;
                    break;
            //Создание продута.
                case 1:
                    
                    break;
            //Список всех товаров.
                case 2:
                    
                    break;
            //Создание покупателя.
                case 3:
                    
                    break;
            //Приобрести продукт.
                case 4:
                    
                    break;
            //Список всех пользователей.
                case 5:
                    
                    break;
            //Подсчет прибыли магазиа за все время работы.
                case 6:
                    
                    break;
                default:
                    System.out.println("Выберите задачу из списка!");
                    break;
            }
        } while (repeat);
    }
}

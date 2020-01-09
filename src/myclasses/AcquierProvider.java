/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Acquier;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AcquierProvider {
    public Acquier createReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---- Создание покупателя ----");
        System.out.println("Имя читателя: ");
        String name = scanner.nextLine();
        System.out.println("Фамилия покупателя: ");
        String surname = scanner.nextLine();
        System.out.println("День рождения: ");
        int day  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Месяц рождения: ");
        int month  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Год рождения: ");
        int year  = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Телефон покупателя: ");
        String phone = scanner.nextLine();
        
        Acquier acquier = new Acquier(name, surname, day, month, year, phone);

        return acquier;
    }
}

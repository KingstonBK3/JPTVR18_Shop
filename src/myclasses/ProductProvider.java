/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;


import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductProvider {
    public Product createProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("===Создание продукта===");
        System.out.println("Название продукта");
        String Name = scanner.nextLine();
        System.out.println("Цена");
        int Price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Идентификатор товара:");
        String idpr = scanner.nextLine();
        Product product = new Product(Name,Price,idpr);
        return product;
    }
}

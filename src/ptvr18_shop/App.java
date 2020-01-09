/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptvr18_shop;

import entity.Acquier;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.Scanner;
import myclasses.AcquierProvider;
import myclasses.ProductProvider;

/**
 *
 * @author pupil
 */
public class App {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Acquier> acquiers = new ArrayList<>();
    private ArrayList<History> histories = new ArrayList<>();
    /*private Saveble saveble;
        public App() {
           // this.saveble = new SaverToFile();
            this.saveble = new SaverToBase();
            this.books.addAll(saveble.loadBooks());
            this.readers.addAll(saveble.loadReaders());
           // this.histories.addAll(saveble.loadHistories());
        }
            
    }*/
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
                    ProductProvider productProvider = new ProductProvider();
                    products.add(productProvider.createProduct());
                    //saveble.saveProducts(products);
                    break;
            //Список всех товаров.
                case 2:
                    boolean flag = true;
                    for (int i = 0; i < products.size(); i++) {
                       for(History history: histories){
                           if(history.getProduct().equals(products.get(i)) 
                                    && history.getGiveOfDate()== null){
                               flag = false;
                               break;
                           }
                       }
                       if(flag){
                           System.out.println(i+1+". "+products.get(i).toString());
                       }
                       flag=true; 
                    }
                    break;
            //Создание покупателя.
                case 3:
                    AcquierProvider acquierProvider = new AcquierProvider();
                    acquiers.add(acquierProvider.createAcquier());
                    //saveble.saveReaders(readers);
                    break;
            //Приобрести продукт.
                case 4:
                    
                    break;
            //Список всех пользователей.
                case 5:
                    for (int i = 0; i < acquiers.size(); i++) {
                        System.out.println(acquiers.get(i).toString());
                    break;
            //Подсчет прибыли магазиа за все время работы.
                /*case 6:
                    
                    break;*/
                default:
                    System.out.println("Выберите задачу из списка!");
                    break;
            }
        } while (repeat);
        }

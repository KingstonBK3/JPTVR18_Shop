/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Acquier;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import static javax.swing.UIManager.get;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    private Scanner scanner = new Scanner(System.in);
    public History takeOnProduct(ArrayList<Product> products, ArrayList<Acquier> acquiers, ArrayList<History>histories){
        HashSet<Product> setProducts = new HashSet<>();
        int counterPrintedProducts = 0;
        System.out.println("Список продуктов: ");
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
                    setProducts.add(products.get(i));
            }
            flag=true;
            if(setProducts.contains(products.get(i))){
                System.out.println(i+1+". "+products.get(i).toString());
                counterPrintedProducts++;
            }
        }
        if(counterPrintedProducts == 0){
            System.out.println("Все товары проданы.");
            return null;
        }
        System.out.println("Выберите товар: ");
        int indexProduct = scanner.nextInt();
        Product product = products.get(indexProduct-1);
        System.out.println("Список покупателей: ");
        for (int i = 0; i < acquiers.size(); i++) {
            Acquier aqcuier = acquiers.get(i);
            System.out.println(i+1+". " + aqcuier.toString());
        }
        System.out.println("Выберите покупателя: ");
        int indexAqcuier = scanner.nextInt();
        Acquier acquier = acquiers.get(indexAqcuier-1);
        History history = new History(null, product, acquier);
        //History history = new History();
        //history.setBook(product);
        //history.setAcquier(acquier);
        //history.setGiveOfDate(new Date());
        return history;
    }

    /*public void returnBook(ArrayList<History> histories) {
        System.out.println("---- Возврат книги ----");
        System.out.println("Список историй:");
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            if(history.getReturnOfDate()==null){
               System.out.println(i+". Читатель "+history.getReader().getName()
                        +" "+history.getReader().getSurname()
                        +" читает книгу: "
                        + history.getBook().getName()
                ); 
            }
        }
        System.out.println("Выберите нужный номер истории");
        int numHistory = scanner.nextInt();
        History history = histories.get(numHistory);
        history.setReturnOfDate(new Date());
    }*/
}
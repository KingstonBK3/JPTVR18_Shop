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
    public History TakeOnProduct(ArrayList<Product> produtcs,ArrayList<Acquier> acquieres,ArrayList<History> histories){
        
        HashSet<Product> setProducts = new HashSet<>();
        int counterSalesProducts = 0;
        System.out.println("Список товаров: ");
        boolean flag = true;
        for(int i = 0;i < produtcs.size(); i++){
            for(History history: histories){
                if(history.getProduct().equals(produtcs.get(i))
                        && history.getSalesOfDate() == null){
                    flag = false;
                    break;
                }
            }
        }
    }
}

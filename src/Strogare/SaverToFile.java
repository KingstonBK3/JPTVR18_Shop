/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strogare;

import entity.Acquier;
import entity.History;
import entity.Product;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class SaverToFile implements Savable{

    @Override
    public void saveProducts(ArrayList<Product> products) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Products.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Products.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка записи Products.txt", ex);
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
        
    }

   
    @Override
    public Collection<? extends Product> loadProducts() {
        ArrayList<Product> products = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Products.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            products = (ArrayList<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Products.txt");
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка чтения Products.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не нашел класс Product", ex);
        }
        return products;
    }

    @Override
    public void saveAcquiers(ArrayList<Acquier> acquiers) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Readers.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(acquiers);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Acquiers.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка записи Acquiers.txt", ex);
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
        
    }

    @Override
    public Collection<? extends Acquier> loadAcquiers() {
        ArrayList<Acquier> acquiers = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Acquiers.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            acquiers = (ArrayList<Acquier>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Acquier.txt");
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка чтения Acquiers.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не нашел класс Product", ex);
        }
        return acquiers;
    }

    @Override
    public void saveHistories(ArrayList<History> histories) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Histories.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(histories);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Histories.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка записи Histories.txt", ex);
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка освобождения ресурса", ex);
                }
            }
        }
        
    }

    @Override
    public Collection<? extends History> loadHistories() {
        ArrayList<History> histories = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("Histories.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            histories = (ArrayList<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет файла Histories.txt");
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Ошибка чтения Histories.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не нашел класс Histories", ex);
        }
        return histories;
    }
    
}

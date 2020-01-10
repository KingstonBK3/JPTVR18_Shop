/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strogare;

import entity.Acquier;
import entity.History;
import entity.Product;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author pupil
 */
public interface Savable {
    public void saveProducts(ArrayList<Product> products);
    public Collection<? extends Product> loadProducts();
    public void saveAcquiers(ArrayList<Acquier> acquiers);
    public Collection<? extends Acquier> loadAcquiers();
    public void saveHistories(ArrayList<History> histories);
    public Collection<? extends History> loadHistories();
}

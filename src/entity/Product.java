/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;

/**
 *
 * @author pupil
 */
public class Product {
    private Long Id;
    private String Name;
    private int Price;
    private int DateOfSale;
    
    public Product(){
    };
    
    public Product(String Name,int Price,int DateOfSale){
        this.Name = Name;
        this.Price = Price;
        this.DateOfSale = DateOfSale;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return Price;
    }

    public int getDateOfSale() {
        return DateOfSale;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setDateOfSale(int DateOfSale) {
        this.DateOfSale = DateOfSale;
    }

    @Override
    public String toString() {
        return "Product{" + "Id=" + Id + ", Name=" + Name + ", Price=" + Price + ", DateOfSale=" + DateOfSale + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Id);
        hash = 89 * hash + Objects.hashCode(this.Name);
        hash = 89 * hash + this.Price;
        hash = 89 * hash + this.DateOfSale;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.Price != other.Price) {
            return false;
        }
        if (this.DateOfSale != other.DateOfSale) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
    
    
}

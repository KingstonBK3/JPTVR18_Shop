/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author pupil
 */
@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date GiveOfDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Product product;
    @OneToOne
    private Acquier user;
    
    private int CountOfProduct;
            
    public History(){
    }

    public History(Object object, Product product, Acquier acquier, int countProduct) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Date getGiveOfDate() {
        return GiveOfDate;
    }

    public void setGiveOfDate(Date GiveOfDate) {
        this.GiveOfDate = GiveOfDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Acquier getUser() {
        return user;
    }

    public void setUser(Acquier user) {
        this.user = user;
    }

    public int getCountOfProduct() {
        return CountOfProduct;
    }

    public void setCountOfProduct(int CountOfProduct) {
        this.CountOfProduct = CountOfProduct;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Id);
        hash = 59 * hash + Objects.hashCode(this.GiveOfDate);
        hash = 59 * hash + Objects.hashCode(this.product);
        hash = 59 * hash + Objects.hashCode(this.user);
        hash = 59 * hash + this.CountOfProduct;
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
        final History other = (History) obj;
        if (this.CountOfProduct != other.CountOfProduct) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.GiveOfDate, other.GiveOfDate)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "History{" + "Id=" + Id + ", GiveOfDate=" + GiveOfDate + ", product=" + product + ", user=" + user + ", CountOfProduct=" + CountOfProduct + '}';
    }
    
    
} 

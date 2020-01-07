/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author pupil
 */
public class History {
    private Long Id;
    private Date GiveOfDate;
    private Product product;
    private Acquier user;
    
    public History(){
    }
    
    public History(Date GiveOfDate,Product product,Acquier user){
        this.GiveOfDate = GiveOfDate;
        this.product = product;
        this.user = user;
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

    @Override
    public String toString() {
        return "History{" + "Id=" + Id + ", GiveOfDate=" + GiveOfDate + ", product=" + product + ", user=" + user + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.Id);
        hash = 83 * hash + Objects.hashCode(this.GiveOfDate);
        hash = 83 * hash + Objects.hashCode(this.product);
        hash = 83 * hash + Objects.hashCode(this.user);
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
    
    
}

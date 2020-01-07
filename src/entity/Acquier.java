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
public class Acquier {
    private Long Id;
    private String Name;
    private String Surname;
    private int Day;
    private int Mounth;
    private int Year;
    private String PhoneNumber;
    
    public Acquier(){
    }
    
    public Acquier(String Name,String Surname,int Day,int Mounth,int Year,String PhoneNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.Day =  Day;
        this.Mounth = Mounth;
        this.Year = Year;
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getMounth() {
        return Mounth;
    }

    public void setMounth(int Mounth) {
        this.Mounth = Mounth;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return "Acquier{" + "Id=" + Id + ", Name=" + Name + ", Surname=" + Surname + ", Day=" + Day + ", Mounth=" + Mounth + ", Year=" + Year + ", PhoneNumber=" + PhoneNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Id);
        hash = 59 * hash + Objects.hashCode(this.Name);
        hash = 59 * hash + Objects.hashCode(this.Surname);
        hash = 59 * hash + this.Day;
        hash = 59 * hash + this.Mounth;
        hash = 59 * hash + this.Year;
        hash = 59 * hash + Objects.hashCode(this.PhoneNumber);
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
        final Acquier other = (Acquier) obj;
        if (this.Day != other.Day) {
            return false;
        }
        if (this.Mounth != other.Mounth) {
            return false;
        }
        if (this.Year != other.Year) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Surname, other.Surname)) {
            return false;
        }
        if (!Objects.equals(this.PhoneNumber, other.PhoneNumber)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
    
    
}

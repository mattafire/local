/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernateExample;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mattafire
 */
@Entity (name="PUMPKINS")
public class Pumpkin implements Serializable{

    public Pumpkin() {
        
    }
   
    public Pumpkin(String color,int weight,int diamiter){
        setColor(color);
        setWeight(weight);
        setDiamiter(diamiter);
    }
    @Id
    int ID;
    @Column (name="PUMPKIN_COLOR")
    String color = "Orange";
    @Column (name="PUMPKIN_DIAMITER")
    int diamiter = 1;
    @Column (name="PUMPKIN_WEIGHT")
    int weight = 1;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDiamiter() {
        return diamiter;
    }

    public void setDiamiter(int diamiter) {
        this.diamiter = diamiter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
}

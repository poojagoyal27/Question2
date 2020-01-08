package com.example.Question2;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Entity
public class EntityPactice  implements Serializable { //may need to make serializable

private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    //private int ID;
    private String description;
    private String name;

    public EntityPactice() {}



    public EntityPactice( String description, String name) {
        this.description = description;
        this.name = name;
        //this.ID = ID;
    }

   /* public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    } */

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}

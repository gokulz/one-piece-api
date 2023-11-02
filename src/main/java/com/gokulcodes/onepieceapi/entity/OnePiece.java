package com.gokulcodes.onepieceapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "onepiece")
public class OnePiece {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name = "first_name")
    private String name;

    @Column(name = "island")
    private String island;

    @Column(name = "bounty")
    private int bounty;


    public OnePiece() {
    }


    public OnePiece(String name, String island, int bounty) {
       
        this.name = name;
        this.island = island;
        this.bounty = bounty;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsland() {
        return this.island;
    }

    public void setIsland(String island) {
        this.island = island;
    }

    public int getBounty() {
        return this.bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", island='" + getIsland() + "'" +
            ", bounty='" + getBounty() + "'" +
            "}";
    }



    
}

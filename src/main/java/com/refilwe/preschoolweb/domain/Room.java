/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschoolweb.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fifi
 */
@Entity
public class Room implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String roomName;
    private int roomNumber;
    private int seats;

    public String getRoomName() {
        return roomName;
    }
    public int getSeats(){
        return seats;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    
    public Long getId() {
        return id;
    }
    
    private Room(){
        
    }
    private Room(Builder builder){
        roomName = builder.roomName;
        roomNumber = builder.roomNumber;
        seats = builder.seats;
        
        
    }
    
    public static class Builder{
        
        public String roomName;
        public int roomNumber;
        public int seats;
        
        public Builder(int roomNumber){
            this.roomNumber = roomNumber; 
        }
        
        public Builder RoomName(String roomName){
            this.roomName = roomName;
            return this;
        }
        public Builder Seats(int seats){
            this.seats = seats;
            return this;
        }
        
        public Room build(){
            
            return new Room(this);
        }
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.refilwe.preschoolweb.domain.Room[ id=" + id + " ]";
    }
    
}

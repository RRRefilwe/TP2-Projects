/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.refilwe.preschool.model;

import java.util.Objects;

/**
 *
 * @author stud
 */
public class Room {
    
    public String roomName;
    public int roomNumber;
    public int seats;

    public String getRoomName() {
        return roomName;
    }
    public int getSeats(){
        return seats;
    }

    public int getRoomNumber() {
        return roomNumber;
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
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (!Objects.equals(this.roomName, other.roomName)) {
            return false;
        }
        if (!Objects.equals(this.seats, other.seats)) {
            return false;
        }
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        return true;
    }
    

   
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryoop;

/**
 *
 * @author nonyx
 */
public class Transaction {
    public enum TransactionType{
        IN, 
        OUT,
    }
    
    private String date, product;
    private int quantity;
    private TransactionType type;
    
    public Transaction(){
        
    }
    public Transaction(String date, String product, int quantity){
        this.date = date;
        this.product = product;
        this.quantity = quantity;
    }
    
    //accessors and mutators
    //setters
    public void setDate(String date){
        this.date = date;
    }
    public void setProduct(String product){
        this.product = product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setType(TransactionType type){
        this.type = type;
    }
    //getters
    public String getDate(){
        return this.date;
    }
    public String getProduct(){
        return this.product;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public TransactionType getType(){
        return this.type;
    }
}

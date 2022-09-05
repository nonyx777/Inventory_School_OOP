/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryoop;

/**
 *
 * @author nonyx
 */
public class Sale extends Transaction{
    public Sale(){
        this.setType(TransactionType.OUT);
    }
    public Sale(String date, String product, int quantity){
        super(date, product, quantity);
    }
}

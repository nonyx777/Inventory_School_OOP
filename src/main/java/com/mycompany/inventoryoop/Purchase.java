/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryoop;

/**
 *
 * @author nonyx
 */
public class Purchase extends Transaction{
    public Purchase(){
        
    }
    public Purchase(String date, String product, int quantity, Transaction.TransactionType type){
        super(date, product, quantity, type);
    }
}
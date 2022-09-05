/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.inventoryoop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 *
 * @author nonyx
 */
public class PurchaseTest{
    @Test
    void purchaseValidity(){
        //expectation array list
        ArrayList<Object> expectation = new ArrayList<>();
        //reality array list
        ArrayList<Object> reality = new ArrayList<>();
        //instantiating
        Purchase purchase = new Purchase("tuesday", "phone", 3);
        //added into expectation array list
        var purchaseDate = "tuesday";
        var purchaseProduct = "phone";
        Transaction.TransactionType purchaseType = Transaction.TransactionType.IN;
        //add these into the expectation array list
        expectation.add(purchaseDate);
        expectation.add(purchaseProduct);
        expectation.add(purchaseType);
        //add these into the reality array list
        reality.add(purchase.getDate());
        reality.add(purchase.getProduct());
        reality.add(purchase.getType());
        
        //iterate through both array lists and test
        for(int i = 0; i < expectation.size() - 1; i++){
            assertEquals(expectation.get(i), reality.get(i));
        }
    }
}

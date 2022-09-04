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
public class SaleTest extends Transaction{
    @Test
    void saleValidity(){
        //expectation array list
        ArrayList<Object> expectation = new ArrayList<>();
        //reality array list
        ArrayList<Object> reality = new ArrayList<>();
        //instantiating
        Sale sale = new Sale("monday", "laptop", 3, Transaction.TransactionType.OUT);
        //added into expectation array list
        var saleDate = sale.getDate();
        var saleProduct = sale.getProduct();
        Transaction.TransactionType saleType = sale.getType();
        //add these into the expectation array list
        expectation.add(saleDate);
        expectation.add(saleProduct);
        expectation.add(saleType);
        //add these into the reality array list
        reality.add(sale.getDate());
        reality.add(sale.getProduct());
        reality.add(sale.getType());
        
        
        for(int i = 0; i < expectation.size() - 1; i++){
            assertEquals(expectation.get(i), reality.get(i));
        }
    }
}

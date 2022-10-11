/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacelesson.bean;

/**
 *
 * @author ASUS
 */
public class Wolvo implements Startable,Stoptable{

    @Override
    public void start() {
        System.out.println("salam");
    }

    @Override
    public void stop() {
        System.out.println("sagol");
    }
    
}

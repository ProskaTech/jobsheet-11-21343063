/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_11;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_3_b extends latihan_3_a{
    public static void testClassMethod(){
        System.out.println("the class method in hewan");
    }
    public void testInstanceMethod(){
        System.out.println("the instance method in gajah");
    }
    public static void main(String[]args){
        latihan_3_b myGajah = new latihan_3_b();
        latihan_3_a myHewan = myGajah;
        latihan_3_a.testClassMethod();
        myHewan.testInstanceMethod();
    }
}

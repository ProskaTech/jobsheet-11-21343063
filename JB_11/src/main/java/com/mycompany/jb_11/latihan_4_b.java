/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_11;

/**
 *
 * @author user
 */
public class latihan_4_b extends latihan_4_a{
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    public int getB(){
        return b;
    }
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = " +getB());
    }
}

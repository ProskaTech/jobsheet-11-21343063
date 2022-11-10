/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_11;

/**
 *
 * @author user
 */
public class latihan_5_b {
    public static void main(String[]args){
        latihan_5_a busMini = new latihan_5_a();
        
        busMini.penumpang = 5;
        busMini.maxpenumpang = 15;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang + 5;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang - 2;
        busMini.cetak();
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}

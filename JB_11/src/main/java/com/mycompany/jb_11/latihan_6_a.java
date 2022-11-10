/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_11;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_6_a {
    private int penumpang;
    private int maxPenumpang;
    
    public latihan_6_a(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang + penumpang;
        if(temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang bus sekarang : "+ penumpang);
        System.out.println("Penumpang maks seharusnya : "+maxPenumpang);
    }
}

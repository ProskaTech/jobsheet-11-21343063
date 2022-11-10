/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jb_11;

/**
 *
 * @created by 21343063_Nurul Husna
 */
public class latihan_2_b extends latihan_2_a{
    private String noKaryawan;
    
    public latihan_2_b(String noKaryawan, String name, int age){
        super(name,age);
        this.noKaryawan = noKaryawan;
    }
    public void info(){
        System.out.println("No. Karyawan : "+ this.noKaryawan);
        super.info();
    }
}

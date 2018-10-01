/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Praktikum;

/**
 *
 * @author Lenovo
 */
public class Eksepsi extends Exception{
    private int bilangan;
    Eksepsi(){
}
    Eksepsi(String pesan){
        super(pesan);
    }
    Eksepsi(String pesan, int nilai){
        super(pesan);
        bilangan=nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
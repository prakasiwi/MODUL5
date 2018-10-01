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
import java.util.Scanner;
public class UjiEksepsi {
    public static void angka(int a) throws Eksepsi {
        if(a<0){
            throw new Eksepsi("No Absen tidak boleh negatif",a);
        } 
    }
    public static void main(String[] args) {
        try{
        System.out.print("Masukkan No Absen Anda : ");
        Scanner scan=new Scanner(System.in);
        int ang=scan.nextInt();
        angka(ang);        
            System.out.println("No Absen anda adalah : "+ang);
        }catch(Eksepsi e){
            System.out.println(e.getMessage());
        }
    }
}

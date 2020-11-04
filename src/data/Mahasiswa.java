/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menampilakan perkenalan mahasiswa
 */
public class Mahasiswa {
    public String nim;
    public String nama;
    
    public void perkenalkanDiri(){
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is " + this.nim);
        System.out.println("My Name is " + this.nama);
        System.out.println("");
    }
}

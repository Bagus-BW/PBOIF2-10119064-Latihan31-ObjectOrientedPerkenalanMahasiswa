/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan31.objectorientedperkenalanmahasiswa;

import data.Mahasiswa;


/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi untuk menampilakan perkenalan mahasiswa
 */
public class PBOIF210119064Latihan31ObjectOrientedPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "10110269";
        mahasiswa1.nama = "Rizki Adam Kurniawan";
        mahasiswa1.perkenalkanDiri();
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nim = "10110270";
        mahasiswa2.nama = "Indra Tiola";
        mahasiswa2.perkenalkanDiri();
        
        Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.nim = "10110271";
        mahasiswa3.nama = "Robi Tanzil Ganefi";
        mahasiswa3.perkenalkanDiri();
        
        Mahasiswa mahasiswa4 = new Mahasiswa();
        mahasiswa4.nim = "10110272";
        mahasiswa4.nama = "Muhammad Nur Awaludin";
        mahasiswa4.perkenalkanDiri();
        
    }
    
}

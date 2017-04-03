/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Paman Gobel
 */
public class simpan {
    String Nama, Alamat, No_telp, Email;

    public simpan(String Nama, String Alamat, String No_telp, String Email) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.No_telp = No_telp;
        this.Email = Email;
    }
    
    void tampil(){
        System.out.println("Nama : "+Nama);
        System.out.println("Alamat : "+Alamat);
        System.out.println("No Hp : "+No_telp);
        System.out.println("Email : "+Email);
    }
}

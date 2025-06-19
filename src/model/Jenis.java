/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Jenis {
    private int id_jenis;
    private String nama;

    public Jenis (){}
    
    public Jenis(int id_jenis, String nama) {
        this.id_jenis = id_jenis;
        this.nama = nama;
    }

    public int getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void infoJenis(){   
    String info = "Id Jenis: " + getId_jenis() + "\n"
                + "Nama: " + getNama() + "\n";

    JOptionPane.showMessageDialog(null, "Data Jenis berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
    JOptionPane.showMessageDialog(null, info, "Data Jenis", JOptionPane.INFORMATION_MESSAGE);    
    }
    
}

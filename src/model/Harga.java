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
public class Harga {
    private int id_harga;
    private String keterangan;
    private int nominal;
    private int id_users;
    
    public Harga(){}

    public Harga(int id_harga, String keterangan, int nominal, int id_users) {
        this.id_harga = id_harga;
        this.keterangan = keterangan;
        this.nominal = nominal;
        this.id_users = id_users;
    }

    public int getId_harga() {
        return id_harga;
    }

    public void setId_harga(int id_harga) {
        this.id_harga = id_harga;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }
    
    public void infoHarga(){
        String info = "ID Harga : " + getId_harga() + "\n"
                    + "Keterangan : " + getKeterangan() + "\n"
                    + "Nominal : " + getNominal() + "\n"
                    + "ID Users : " + getId_users() + "\n";
        
        JOptionPane.showMessageDialog(null, "Data Harga berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
        JOptionPane.showMessageDialog(null, info, "Data Harga", JOptionPane.INFORMATION_MESSAGE);    
    }
}

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
public class Jasa {
    private int id_jasa;
    private String keterangan;
    private int nominal;
    private int id_users;
    
    public Jasa(){}

    public Jasa(int id_jasa, String keterangan, int nominal, int id_users) {
        this.id_jasa = id_jasa;
        this.keterangan = keterangan;
        this.nominal = nominal;
        this.id_users = id_users;
    }

    public int getId_jasa() {
        return id_jasa;
    }

    public void setId_jasa(int id_jasa) {
        this.id_jasa = id_jasa;
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
    
    public void infoJasa(){   
    String info = "ID Jasa: " + getId_jasa() + "\n"
                + "Keterangan: " + getKeterangan() + "\n"
                + "Nominal: " + getNominal() + "\n"
                + "ID Users: " + getId_users() + "\n";

    JOptionPane.showMessageDialog(null, "Data Jasa berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
    JOptionPane.showMessageDialog(null, info, "Data Jasa", JOptionPane.INFORMATION_MESSAGE);    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.JOptionPane;
import java.util.Date;
/**
 *
 * @author User
 */
public class Pengeluaran {
    private int id_pengeluaran;
    private Date tanggal;
    private String keterangan;
    private int nominal;
    private int id_jenis;
    private int id_users;
    
    public Pengeluaran(){};

    public int getId_pengeluaran() {
        return id_pengeluaran;
    }

    public void setId_pengeluaran(int id_pengeluaran) {
        this.id_pengeluaran = id_pengeluaran;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
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

    public int getId_jenis() {
        return id_jenis;
    }

    public void setId_jenis(int id_jenis) {
        this.id_jenis = id_jenis;
    }

    public int getId_users() {
        return id_users;
    }

    public void setId_users(int id_users) {
        this.id_users = id_users;
    }
    
    public void infoPengeluaran(){   
    String info = "Id Pengeluaran: " + getId_pengeluaran() + "\n"
               + "Tanggal: " + getTanggal() + "\n"
               + "Keterangan: " + getKeterangan() + "\n"
               + "Nominal: " + getNominal() + "\n"
               + "Id Jenis: " + getId_jenis() + "\n"
               + "Id Users: " + getId_users() + "\n";

    JOptionPane.showMessageDialog(null, "Data Pengeluaran berhasil diinput!", "Informasi", JOptionPane.INFORMATION_MESSAGE);  
    JOptionPane.showMessageDialog(null, info, "Data Pengeluaran", JOptionPane.INFORMATION_MESSAGE);    
    }
}

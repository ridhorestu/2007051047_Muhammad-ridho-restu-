/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headphone.model;

/**
 *
 * @author Ridho restu
 */
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Ridho restu
 */
public class Headphone {
    private String kode;
    private String nama;
    private String tanggal_pembelian;
    private String jenis_headphone;
    private String merek_headphone;
    private String harga_headphone;

    public Headphone(String kode, String nama, String tanggalpembelian, String jenisheadphone, String merekheadphone, String hargaheadphone) {
        this.kode = kode;
        this.nama = nama;
        this.tanggal_pembelian = tanggalpembelian;
        this.jenis_headphone = jenisheadphone;
        this.merek_headphone = merekheadphone;
        this.harga_headphone = hargaheadphone;
    }

    public Headphone(String text, String text0, String toString, ToggleGroup jenis, String toString0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggal_pembelian() {
        return tanggal_pembelian;
    }

    public void setTanggal_pembelian(String tanggal_pembelian) {
        this.tanggal_pembelian = tanggal_pembelian;
    }

    public String getJenis_headphone() {
        return jenis_headphone;
    }

    public void setJenis_headphone(String jenis_headphone) {
        this.jenis_headphone = jenis_headphone;
    }

    public String getMerek_headphone() {
        return merek_headphone;
    }

    public void setMerek_headphone(String merek_headphone) {
        this.merek_headphone = merek_headphone;
    }

    public String getHarga_headphone() {
        return harga_headphone;
    }

    public void setHarga_headphone(String harga_headphone) {
        this.harga_headphone = harga_headphone;
    }
    
}
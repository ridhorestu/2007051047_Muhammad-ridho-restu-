/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headphone.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import headphone.model.Headphone;
/**
 *
 * @author Ridho restu
 */
public class DBHandler {
  public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addHeadphone(Headphone hpn){
        String insertheadphone = "INSERT INTO `headphone`(`kode`, `nama`, `tanggal_pembelian`,`jenis_headphone`,`merek_headphone`,`harga_headphone`)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertheadphone);
            stmtInsert.setString(1, hpn.getKode());
            stmtInsert.setString(2, hpn.getNama());
            stmtInsert.setString(3, hpn.getTanggal_pembelian());
            stmtInsert.setString(4, hpn.getJenis_headphone());
            stmtInsert.setString(5, hpn.getMerek_headphone());
            stmtInsert.setString(6, hpn.getHarga_headphone());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
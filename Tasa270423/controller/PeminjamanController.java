/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa270423.controller;
import Tasa270423.model.*;
import Tasa270423.view.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

/**
 *
 * @author maita
 */
public class PeminjamanController {
    private Peminjaman peminjaman;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman formPeminjaman;
    
    private AnggotaDao anggotaDao;
    private BukuDao bukuDao;
    
    public PeminjamanController(FormPeminjaman formPeminjaman){
        this.formPeminjaman = formPeminjaman;
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
    }
    
    public void isiCombo(){
        List<Anggota> listAnggota = anggotaDao.getAllAnggota();
        List<Buku> listBuku = bukuDao.getAllBuku();
        formPeminjaman.getCboAnggota().removeAllItems();
        formPeminjaman.getCboBuku().removeAllItems();
        //isi anggota
        for (Anggota anggota : listAnggota) {
            formPeminjaman.getCboAnggota().addItem(anggota.getKodeAnggota());
        }
        
        for (Buku buku : listBuku) {
            formPeminjaman.getCboBuku().addItem(buku.getKodeBuku());
        }
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(
   anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }
    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getCboAnggota()
                    .setSelectedItem(peminjaman.getAnggota().getKodeAnggota());
            formPeminjaman.getCboBuku()
                    .setSelectedItem(peminjaman.getBuku().getKodeBuku());
            formPeminjaman.getTxtTglpinjam()
                    .setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali()
                    .setText(peminjaman.getTglkembali());
        }
    }
    
    public void updatePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(
   anggotaDao.getAnggota(formPeminjaman.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(
            bukuDao.getBuku(formPeminjaman.getCboBuku().getSelectedIndex()));
        peminjaman.setTglPinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglKembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.update(idx,peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update Ok");
    }
    
    public void deletePeminjaman(){
        int idx = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAllPeminjaman();
        for(Peminjaman peminjaman : list){
            Object[] data = {
                peminjaman.getAnggota().getKodeAnggota(),
                peminjaman.getBuku().getKodeBuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(data);
        }
    }
}
    
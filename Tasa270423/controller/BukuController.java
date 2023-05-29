/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa270423.controller;

import Tasa270423.model.*;
import Tasa270423.view.FormBuku;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maita
 */
public class BukuController {
      private FormBuku form;
    private BukuDao bukuDao;
    private Buku buku;
    public BukuController(FormBuku form){
        this.form = form;
        bukuDao = new BukuDaoImpl();
    }
    public void cls(){
        form.getTxtKodeBuku().setText("");
        form.getTxtJudul().setText("");
        form.getTxtPengarang().setText("");
        form.getTxtPenerbit().setText("");
        form.getTxtTahun().setText("");
    }
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(form.getTxtKodeBuku().getText());
        buku.setJudul(form.getTxtJudul().getText());
        buku.setPengarang(form.getTxtPengarang().getText());
        buku.setPenerbit(form.getTxtPenerbit().getText());
        buku.setTahun(form.getTxtTahun().getText());
        bukuDao.save(buku);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }
    public void getBuku(){
        int index = form.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku != null){
            form.getTxtKodeBuku().setText(buku.getKodeBuku());
            form.getTxtJudul().setText(buku.getJudul());
            form.getTxtPengarang().setText(buku.getPengarang());
            form.getTxtPenerbit().setText(buku.getPenerbit());
            form.getTxtTahun().setText(buku.getTahun());
        }
    }
    
    public void updateBuku(){
        int idx = form.getTblBuku().getSelectedRow();
        buku.setKodeBuku(form.getTxtKodeBuku().getText());
        buku.setJudul(form.getTxtJudul().getText());
        buku.setPengarang(form.getTxtPengarang().getText());
        buku.setPenerbit(form.getTxtPenerbit().getText());
        buku.setTahun(form.getTxtTahun().getText());
        bukuDao.update(idx,buku);
    }
    
    public void deleteBuku(){
        int idx = form.getTblBuku().getSelectedRow();
        bukuDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Buku> list = bukuDao.getAllBuku();
        for(Buku buku : list){
            Object[] data = {
                buku.getKodeBuku(),
                buku.getJudul(),
                buku.getPengarang(),
                buku.getPenerbit(),
                buku.getTahun()
            };
            tabelModel.addRow(data);
        }
    }
}

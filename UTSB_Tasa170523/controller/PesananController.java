/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSB_Tasa170523.controller;

import UTSB_Tasa170523.view.FormPesanan;
import UTSB_Tasa170523.model.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author maita
 */
public class PesananController {
    FormPesanan formPesanan;
    Pesanan pesanan;
    PesananDao pesananDao;
    PesananDaoImpl pesananDaoImpl;
    
    public PesananController(FormPesanan formPesanan ) {
        this.formPesanan = formPesanan;
        pesananDao = new PesananDaoImpl();
    }
    
    public void clearForm(){
        formPesanan.getTxtDiskon().setText("");
        formPesanan.getTxtHarga().setText("");
        formPesanan.getTxtKode().setText("");
        formPesanan.getTxtNama().setText("");
        formPesanan.getTxtOngkir().setText("");
        formPesanan.getTxtTanggal().setText("");
    }
    
    public void tampilDataPesanan(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) = tabelModel (DefaultTableModel) formPesanan.getTblPesanan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Pesanan> list = pesananDao.getAllPesanan();
        for(Pesanan pesanan : list){
            Object[] data = {
                
            };
            tabelModel.addRow(data);
        }
    }
}

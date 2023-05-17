/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSB_Tasa170523.model;
import java.util.*;
/**
 *
 * @author maita
 */
public class PesananDaoImpl implements PesananDao {
    List<Pesanan> data = new ArrayList();
    
    public void save(Pesanan pesanan) {
        data.add(pesanan);
    }
    
    public void update(int index, Pesanan pesanan) {
        data.set(index, pesanan);
    }
    
  
    public void delete (int index) {
        data.remove(index);
    }
    
 
    public Pesanan getPesanan (int index) {
        return data.get(index);
    }
    
    public List<Pesanan> getAllPesanan() {
        return data;
    }
}

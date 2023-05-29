/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasa270423.model;

/**
 *
 * @author maita
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;
    
    public Peminjaman() {
        
    }
    
    public Peminjaman(Anggota anggota, Buku buku, String tglpinjam, 
            String tglkembali){
        this.anggota = anggota;
        this.buku = buku;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    
    public void setAnggota(Anggota anggota){
        this.anggota = anggota;
    }
    
    public void setBuku(Buku buku){
        this.buku = buku;
    }
     
    public void setTglPinjam(String tglPinjam){
        this.tglpinjam = tglpinjam;
    }
      
    public void setTglKembali(String tglkembali){
        this.tglkembali = tglkembali;
    }
    
    public Anggota getAnggota(){
        return anggota;
    }
    
    public Buku getBuku(){
        return buku;
    }
    
    public String getTglpinjam(){
        return tglpinjam;
    }
    
    public String getTglkembali(){
        return tglkembali;
    }
}

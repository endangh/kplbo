/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

/**
 *
 * @author Ricky
 */
public class Buku {
    private String id;
    private String judul;
    private String penulis;
    private String jenis;
    private int jumlah;
    private double harga;

    public Buku() {
    }

    public Buku(String Id, String judul, String penulis, String jenis,int jumlah, double harga) {
        this.id = Id;
        this.judul = judul;
        this.penulis = penulis;
        this.jenis = jenis;
        this.jumlah= jumlah;
        this.harga = harga;
    }

  

    public String getDeskripsi() {
        return jenis;
    }

    public void setDeskripsi(String Deskripsi) {
        this.jenis = Deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double Harga) {
        this.harga = Harga;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    
    public void tampilData(){
        System.out.println("Kode Buku  : "+id);
        System.out.println("Judul Buku : "+judul);
        System.out.println("Penulis    : "+penulis);
        System.out.println("Jenis buku : "+jenis);
        System.out.println("jumlah     : "+jumlah);
        System.out.println("Harga      : "+harga);
    }

    public String getId() {
        return id;
    }

    public void setId(String Id) {
        this.id = Id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.a;
import java.util.ArrayList;
public abstract class Transaksi {
    
    protected double totalHarga=0;
    protected ArrayList<Buku> buku2 = new ArrayList<>();
    
    public void pesanBuku(){
        /*
         * buat pengulangan untuk pemesanan buku dengan mencari kode buku
         * masukkan pesanan ke dalam list buku2
         * tampilkan buku yang dipesan
         * tampilkan total yang harus dibayar
         * dan lakukan pengecekan pembayaran
         */
    }

    public void tampilBukuSewa(){
        /*
         * tampilkan buku yang ada di list buku2
         */
     }
     protected final Buku cariBukuId(String idBuku){
         Buku buku=null;
         
         return buku;
     }
     public void addBuku(Buku buku){
         /*
          * Tambahkan buku ke dalam list
          */
     }
     
     public void clear(){
        /*
         * hapus semua data pada list
         */
     } 
     
     public boolean isEmpty(){
         /*
          * cek apakah list kosong
          */
     	return false;
     }
    
    public abstract void hitungTotalBayar();
    public abstract void pembayaran(double uangPembayaran);
}

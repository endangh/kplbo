/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ricky
 */
public class Penjualan extends Transaksi{
    @Override
    public void hitungTotalBayar() {
        for (Iterator<Buku> it = buku2.iterator(); it.hasNext();) {
            Buku buku = it.next();
            totalHarga +=(buku.getHarga());
        }
    }

    @Override
    public void pembayaran(double uangPembayaran) {
        if(uangPembayaran>totalHarga){
            System.out.println("Kembali : "+(uangPembayaran-totalHarga));
        }
        else if(uangPembayaran<totalHarga){
            System.out.println("Pembayaran kurang "+(uangPembayaran-totalHarga));
        }else{
            System.out.println("Uang pembayaran pass");
        }
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ricky
 */
public class Sewa extends Transaksi{
    private final double hargaSewa = 0.2d;

    @Override
    public void pesanBuku() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Id Member : ");String idMember =sc.next();
        Member member=null ;
        for (Iterator<Member> it = BukuMania.listAllMember.iterator(); it.hasNext();) {
            Member members = it.next();
            if(members.getId().equals(idMember)){
                member=members;
            }
        }
        if(member!=null){
            super.pesanBuku();
            System.out.println("Terima kasih telah meminjam");
            System.out.println(member.getNama());
        }
        else{
            System.out.println("Member tidak ditemukan");
        }
    }
    
    @Override
    public void hitungTotalBayar() {
        for (Iterator<Buku> it = buku2.iterator(); it.hasNext();) {
            Buku buku = it.next();
            totalHarga +=(buku.getHarga()*hargaSewa);
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

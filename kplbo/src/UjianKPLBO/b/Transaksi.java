/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Transaksi {
    
    protected double totalHarga=0;
    protected ArrayList<Buku> buku2 = new ArrayList<>();
    
    public void pesanBuku(){
        Scanner sc = new Scanner(System.in);
   
        boolean loop =true;
        while(loop){
            System.out.println("masukan kode buku : ");
            String kodeBuku= sc.next();
            Buku buku=cariBukuId(kodeBuku);
            if(buku!=null){
                addBuku(buku);
                System.out.println("buku dimasukan ke list pesanan");
            }
            else{                
                System.out.println("Id buku tidak ketemu");
            }
            System.out.println("Pesan kembali buku ?");
            if (sc.next().equalsIgnoreCase("t")){
                loop=false;
            }
        }
        
        tampilBukuSewa();
        hitungTotalBayar();
        System.out.println("Total Harga: "+totalHarga);
        System.out.print("Jumlah Pembayaran : ");
        double pembayarn = sc.nextDouble();
        pembayaran(pembayarn);
        
    }
    
    public void tampilBukuSewa(){
        int iterasi =0;
        for (Iterator<Buku> it = buku2.iterator(); it.hasNext();) {
            Buku buku = it.next();
            iterasi++;
            System.out.println("buku ke -"+iterasi);
            buku.tampilData();
            
        }
    }
    protected final Buku cariBukuId(String idBuku){
        Buku buku=null;
        for (Iterator<Buku> it = buku2.iterator(); it.hasNext();) {
            Buku bukuList = it.next();
            if (bukuList.getId().equals(idBuku)) {
                buku = bukuList;
                break;
            }
        }
        return buku;
    }
    public void addBuku(Buku buku){
        buku2.add(buku);
    }
    
    public void clear(){
        buku2.clear();
    } 
    
    public boolean isEmpty(){
        return buku2.isEmpty();
    }
    
    public abstract void hitungTotalBayar();
    public abstract void pembayaran(double uangPembayaran);
}

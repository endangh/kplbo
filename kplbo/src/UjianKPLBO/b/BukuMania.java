/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ricky
 */
public class BukuMania {
    static ArrayList<Buku> listAllBuku = new ArrayList<>();
    static ArrayList<Member> listAllMember = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    String input(){
        String string="";
        try {
            string = bf.readLine();
        } catch (Exception e) {
        }
        return string;
    }
    
    public int menuAdministrasi(){
        System.out.println("====Menu====");
        System.out.println("1. Tampil semua data buku");
        System.out.println("2. Tampil semua data member");
        System.out.println("3. Tambah Buku");
        System.out.println("4. Sewa Buku");
        System.out.println("5. Jual Buku");
        System.out.println("6. Exit");
        System.out.print("Pilihan anda :");
        return sc.nextInt();
    }
    
    public void tampilBuku(){
        int iterasi =0;
        for (Iterator<Buku> it = listAllBuku.iterator(); it.hasNext();) {
            Buku buku = it.next();
            iterasi++;
            System.out.println("buku ke -"+iterasi);
            buku.tampilData();
            System.out.println("\n\n");
            
        }
    }
      public void tampilMember(){
        int iterasi =0;
        for (Iterator<Member> it = listAllMember.iterator(); it.hasNext();) {
            Member member = it.next();
            iterasi++;
            System.out.println("Member ke -"+iterasi);
            member.tampilData();
            System.out.println("\n\n");
            
        }
    }
    
    public void tambahBuku(){
          System.out.print("Judul      : ");String judul =input();
          System.out.print("Pengarang  : ");String pengarang =input();
          System.out.print("Jenis      : ");String jenis =input();
          System.out.print("Jumlah     : ");int jmlh =sc.nextInt();
          System.out.print("Harga      : ");double harga =sc.nextDouble();
          String idBuku;
          
          if(listAllBuku.size()<10){
              idBuku= "000"+listAllBuku.size();
          }
          else if(listAllBuku.size()<100){
               idBuku= "00"+listAllBuku.size();
          }
          else if(listAllBuku.size()<1000){
               idBuku= "0"+listAllBuku.size();
          }else{
              idBuku = ""+listAllBuku.size();
          }
          listAllBuku.add(new Buku(idBuku, judul, pengarang, jenis, jmlh, harga));
    }
    
    
    public void prosesAdministrasi(){
       
        int pilih = menuAdministrasi();
        while(pilih!=6){
             switch(pilih){
                case 1 :
                    tampilBuku();
                    break;
                case 2 :
                    tampilMember();
                    break;
                case 3 :
                    tambahBuku();
                    break;
                case 4 :
                    Sewa sewa = new Sewa();
                    sewa.pesanBuku();
                    break;
                case 5 :
                    Penjualan pj = new Penjualan();
                    pj.pesanBuku();
                    break;
                default :
                    System.out.println("Tidak ada pilihan");
                    break;
            }
             pilih = menuAdministrasi();
             
        }
      
    }
    
    
    
    public void initDataBuku(){
        listAllBuku.add(new Buku("0001", "Naruto", "Ayoma", "Komik",2, 17500));
        listAllBuku.add(new Buku("0002", "D.Conan", "Ghoso", "Komik",3, 17500));
        listAllBuku.add(new Buku("0003", "Algoritma Dasar", "Khaerul", "Komputer",10, 17500));
        listAllBuku.add(new Buku("0004", "Java Promgraming", "Rizky", "Komputer",15, 17500));
        listAllBuku.add(new Buku("0005", "Photoshop CS4", "Erik", "Design Grafis",5, 17500));
    }
    public void initDataMember(){
        listAllMember.add(new Member("1405001", "Adung", "Setiabudi"));
        listAllMember.add(new Member("1405002", "Adul", "Gg Hj rido"));
        listAllMember.add(new Member("1405003", "Samsons", "buah batu"));
        listAllMember.add(new Member("1405004", "Roby", "Supratman"));
    }
    
    public static void main(String[] args) {
        BukuMania bukuMania = new BukuMania();
        bukuMania.initDataBuku();
        bukuMania.initDataMember();
        bukuMania.prosesAdministrasi();
    }
}

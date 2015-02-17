/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UjianKPLBO.b;

/**
 *
 * @author Ricky
 */
public class Member extends Orang {

    private String id;

    public Member(String id, String nama, String alamat) {
        this.id = id;
        super.nama = nama;
        super.alamat = alamat;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setAlamat(String alamat) {
        super.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        super.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tampilData() {
        System.out.println("Id Member  : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Alamat     : " + alamat);
    }
}

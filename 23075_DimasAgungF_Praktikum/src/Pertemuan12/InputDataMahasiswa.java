package Pertemuan12;

import java.util.ArrayList;

public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;
    
    public InputDataMahasiswa() {
        listMahasiswa = new ArrayList();
    }
    
    public void insertData(String NIM, String Nama, String Alamat) {
        Mahasiswa mhs = new Mahasiswa(NIM, Nama, Alamat);
        listMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getALL() {
        return listMahasiswa;
    }
    
    public void deleteData(int index) {
        listMahasiswa.remove(index);
    }
}

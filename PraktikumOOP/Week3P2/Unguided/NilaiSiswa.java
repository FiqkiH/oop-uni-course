//Soal Unguided

package PraktikumOOP.Week3P2.Unguided;

public class NilaiSiswa {
    private String nama;
    private float nilai;

    void setData(String nama, float nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    void cetakData() {
        System.out.println(this.nama + " - " + this.nilai);
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }
}

package PraktikumOOP.Week10.Unguided1;

public class Animal {
    private String nama;
    private int umur;
    private static int jumlahHewan = 0;

    public Animal(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public static int hitungJumlahHewan() {
        return jumlahHewan+=1;
    }

    public void tampilInfo() {
        System.out.println("### Informasi Hewan ###" +
                        "\n Nama : " + nama + 
                        "\n Umur: " + umur);
    }
}

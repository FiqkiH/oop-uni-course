package PraktikumOOP.Week3P2;

public class MainNilaiSiswa {
    public static void main(String[] args) {
        NilaiSiswa[] siswa = new NilaiSiswa[5];
        for (int i = 0; i < siswa.length; i++) {
            siswa[i] = new NilaiSiswa();
        }

        siswa[0].setData("Diah", 85.5f);
        siswa[1].setData("Ghilman", 90f);
        siswa[2].setData("Nidya", 78.5f);
        siswa[3].setData("Raka", 88f);
        siswa[4].setData("Kezia", 95f);

        System.out.println("Nama dan Nilai Siswa");
        for (int i = 0; i < siswa.length; i++){
            siswa[i].cetakData();
        }

        float sumNilai = 0;
        float maxNilai = siswa[0].getNilai();
        String maxNama = siswa[0].getNama();
        float minNilai = siswa[0].getNilai();
        String minNama = siswa[0].getNama();

        for (NilaiSiswa nilaiSiswa : siswa){    
            sumNilai += nilaiSiswa.getNilai();
            
            if (nilaiSiswa.getNilai() > maxNilai) {
                maxNilai = nilaiSiswa.getNilai();
                maxNama = nilaiSiswa.getNama();
            }

            if (nilaiSiswa.getNilai() < minNilai) {
                minNilai = nilaiSiswa.getNilai();
                minNama = nilaiSiswa.getNama();
            }
        }

        
        System.out.println("Rata-rata nilai ujian: " + sumNilai / siswa.length);
        System.out.println("Nilai tertinggi: " + maxNama + " dengan nilai " + maxNilai);
        System.out.println("Nilai terendah: " + minNama + " dengan nilai " + minNilai);

    }
}

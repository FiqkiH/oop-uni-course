package PraktikumOOP.Week6P5.Unguided2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rumah Sakit
        RumahSakit rumahSakit = new RumahSakit("RS Telyu");

        // Membuat objek Dokter
        Dokter dokter1 = new Dokter("Dr. Tono", "Spesialis Jantung");
        Dokter dokter2 = new Dokter("Dr. Gandul", "Spesialis Anak");

        // Membuat objek Pasien
        Pasien pasien1 = new Pasien("Amrabat", "RM001");
        Pasien pasien2 = new Pasien("Cukentre", "RM002");

        // Menambahkan keluhan ke pasien
        pasien1.tambahKeluhan("Nyeri dada");
        pasien2.tambahKeluhan("Demam tinggi");

        // Membuat objek Jadwal dan menambahkan pasien ke dalam jadwal dokter
        Jadwal jadwalSenin = new Jadwal("Senin");
        jadwalSenin.tambahPasien(pasien1);
        
        Jadwal jadwalSelasa = new Jadwal("Selasa");
        jadwalSelasa.tambahPasien(pasien2);

        // Menambahkan jadwal ke dokter
        dokter1.tambahJadwal(jadwalSenin);
        dokter2.tambahJadwal(jadwalSelasa);

        // Menambahkan dokter ke rumah sakit
        rumahSakit.tambahDokter(dokter1);
        rumahSakit.tambahDokter(dokter2);

        // Menampilkan informasi rumah sakit dan pasien yang ditangani oleh setiap dokter
        System.out.println("### Informasi Rumah Sakit dan Pasien ###");
        rumahSakit.cetakInfoRumahSakit();

        // Menghapus semua dokter dari rumah sakit
        rumahSakit.hapusSemuaDokter();

        // Menampilkan informasi rumah sakit setelah semua dokter dihapus
        System.out.println("### Setelah Semua Dokter Dihapus ###");
        rumahSakit.cetakInfoRumahSakit();

        // Menampilkan informasi pasien secara langsung untuk memastikan bahwa pasien tetap ada
        System.out.println("### Informasi Pasien Setelah Dokter Dihapus ###");
        System.out.println("Nama Pasien: " + pasien1.getNamaPasien() + ", Nomor Rekam Medis: " + pasien1.getNomorRekamMedis());
        System.out.println("Keluhan: " + pasien1.getDaftarKeluhan());
    }
}

package PraktikumOOP.Week6P5.Unguided1;

public class Main {
    public static void main(String[] args) {
        // Membuat manajer proyek
        Manajer manajer = new Manajer("Diah");

        // Membuat anggota tim pengembang
        AnggotaTim anggota1 = new AnggotaTim("Kezia", "Frontend Developer");
        AnggotaTim anggota2 = new AnggotaTim("Nidya", "Backend Developer");
        AnggotaTim anggota3 = new AnggotaTim("Rizky", "UI/UX Designer");

        // Membuat proyek dan menambahkan anggota tim
        Proyek proyek1 = new Proyek("Dashboard Admin", "2024-12-31");
        proyek1.tambahAnggotaTim(anggota1);
        proyek1.tambahAnggotaTim(anggota2);
        proyek1.tambahAnggotaTim(anggota3);

        // Menambahkan tugas ke proyek
        Tugas tugas1 = new Tugas("Desain antarmuka", "Belum selesai");
        Tugas tugas2 = new Tugas("User Registration", "Belum selesai");
        Tugas tugas3 = new Tugas("User Authentication", "Belum selesai");
        proyek1.tambahTugas(tugas1);
        proyek1.tambahTugas(tugas2);
        proyek1.tambahTugas(tugas3);

        // Menambahkan proyek ke manajer
        manajer.tambahProyek(proyek1);

        // Menampilkan status manajemen proyek
        System.out.println("=== Status Awal ===");
        manajer.tampilkanStatusManajemenProyek();

        // Hapus proyek
        manajer.hapusProyek(proyek1);

        // Menampilkan status setelah proyek dihapus
        System.out.println("=== Setelah Proyek Dihapus ===");
        manajer.tampilkanStatusManajemenProyek();
        proyek1.tampilkanStatusProyek();
    }
    
}

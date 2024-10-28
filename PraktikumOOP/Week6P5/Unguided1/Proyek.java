package PraktikumOOP.Week6P5.Unguided1;

import java.util.List;
import java.util.ArrayList;

public class Proyek {
    private String namaProyek;
    private String deadline;
    private List<AnggotaTim> timPengembang = new ArrayList<>();
    private List<Tugas> daftarTugas = new ArrayList<>();

    public Proyek(String namaProyek, String deadline) {
        this.namaProyek = namaProyek;
        this.deadline = deadline;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public String getDeadline() {
        return deadline;
    }

    public void tambahAnggotaTim(AnggotaTim anggotaTim) {
        timPengembang.add(anggotaTim);
    }

    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
    }

    public void hapusTugas() {
        daftarTugas.clear();
    }

    public void tampilkanStatusProyek() {
        System.out.println("Nama Proyek: " + namaProyek);
        System.out.println("Deadline: " + deadline);
        System.out.println("Daftar Anggota Tim:");
        for (AnggotaTim anggota : timPengembang) {
            System.out.println("- " + anggota.getNamaAnggota() + " (Spesialisasi: " + anggota.getSpesialisasi() + ")");
        }
        System.out.println("Daftar Tugas:");
        for (Tugas tugas : daftarTugas) {
            System.out.println("- " + tugas.getDeskripsiTugas() + " (Status: " + tugas.getStatusTugas() + ")");
        }
    }
}

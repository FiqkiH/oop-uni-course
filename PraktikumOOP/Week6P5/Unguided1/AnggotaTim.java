package PraktikumOOP.Week6P5.Unguided1;

public class AnggotaTim {
    private String namaAnggota;
    private String spesialisasi;

    public AnggotaTim(String namaAnggota, String spesialisasi) {
        this.namaAnggota = namaAnggota;
        this.spesialisasi = spesialisasi;
    }

    public String getNamaAnggota() {
        return namaAnggota;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
}

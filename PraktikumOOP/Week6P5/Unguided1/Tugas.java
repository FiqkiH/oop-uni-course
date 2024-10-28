package PraktikumOOP.Week6P5.Unguided1;

public class Tugas {
    private String deskripsiTugas;
    private String statusTugas;

    public Tugas(String deskripsiTugas, String statusTugas) {
        this.deskripsiTugas = deskripsiTugas;
        this.statusTugas = statusTugas;
    }

    public String getDeskripsiTugas() {
        return deskripsiTugas;
    }

    public String getStatusTugas() {
        return statusTugas;
    }

    public void setStatusTugas(String statusTugas) {
        this.statusTugas = statusTugas;
    }
}
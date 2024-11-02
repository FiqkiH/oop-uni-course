package PraktikumOOP.Week7P6.unguided1;


public class Lingkaran {
    private int jarijari;

    public Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }

    public int getJarijari() {
        return jarijari;
    }

    public int getLuas() {
        return (int) Math.PI * (int) Math.pow(jarijari, 2);
    }

    public int getLuas(int jarijari) {
        return (int) Math.PI * (int) Math.pow(jarijari, 2);
    }
}

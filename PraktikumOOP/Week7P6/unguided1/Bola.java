package PraktikumOOP.Week7P6.unguided1;

public class Bola extends Lingkaran {

    public Bola(int jarijari) {
        super(jarijari);
    }

    @Override
    public int getLuas() {
        return 4 * (int) Math.PI * (int) Math.pow(getJarijari(), 2);
    }

    public int getVolume() {
        return 4/3 * (int) Math.PI * (int) Math.pow(getJarijari(), 3);
    }
    
}

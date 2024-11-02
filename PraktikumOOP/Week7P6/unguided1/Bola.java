package PraktikumOOP.Week7P6.unguided1;

public class Bola extends Lingkaran {

    public Bola(int jarijari) {
        super(jarijari);
    }

    @Override
    public int getLuas() {
        return (int) (4 * Math.PI * Math.pow(getJarijari(), 2));
    }

    public int getVolume() {
        return (int) (4 * Math.PI * Math.pow(getJarijari(), 3) / 3);
    }
    
}

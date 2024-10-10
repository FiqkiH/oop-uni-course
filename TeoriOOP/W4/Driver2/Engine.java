package TeoriOOP.W4.Driver2;

public class Engine {
    private String name;
    private int horsePower;

    public Engine(String name) { //... , int horsePower
        this.name = name;
        //this.horsePower = horsePower;
    }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int hp) {
        this.horsePower = hp;
    }
    
}

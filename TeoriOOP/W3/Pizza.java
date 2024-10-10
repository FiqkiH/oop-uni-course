package TeoriOOP.W3;

public class Pizza {
    private int topping;
    private String sauce;
    public int getTopping(String user) {
        if (user.equals("Andi")) {
            return topping;
        } else return 999;
    }

    public void setTopping(int howMany) {
        if (howMany < 3) {
            this.topping = howMany;
        }
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String somesSauces) {
        this.sauce = somesSauces;
    }
}

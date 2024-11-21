package TeoriOOP.W12.Projek3;

public class TryException {
    int number[] = new int[5];

    public void setNumber(int id, int number) {
        try {
            this.number[id] = 5/number;
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("Error in setNumber");
        }
    }
    public int getNumber(int id) {
        try {
            return number[id];
        } catch (Exception e) {
            return 0;
        }  
    } 
}

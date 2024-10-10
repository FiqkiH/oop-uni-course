package TeoriOOP.KuisClassObject;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();

        hp.hidupkan();
        hp.lakukanPanggilan();
        hp.kirimSMS();
        hp.matikan();
    }
}

/*Kalau running di dalam folder ketika compile bisa menggunakan path seperti biasa
 * tapi untuk running path nya dipisahin pakai dot (.) ex: TeoriOOP.KuisClassObject.HandphoneBeraksi
 */

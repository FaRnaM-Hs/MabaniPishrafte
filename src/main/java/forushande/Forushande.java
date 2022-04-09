package forushande;

import khodro.jadid.Mashin;

public class Forushande {

    public static String[] nameForushandegan = new String[10];

    static {
        nameForushandegan[0] = "Ali";
        nameForushandegan[1] = "Ahmad";
    }

    public void forushMashin() {
        Mashin.tedadeForush++;
    }
}

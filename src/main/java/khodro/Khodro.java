package khodro;

public abstract class Khodro {

    boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }

    public void khamoosh() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();
}

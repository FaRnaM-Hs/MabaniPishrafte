package khodro;

public class Motor {

    boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }
    public void khamoosh() {
        ayaRoshanAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        return ayaRoshanAst;
    }
}

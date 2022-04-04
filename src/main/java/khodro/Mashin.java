package khodro;

public class Mashin {

    boolean ayaRoshanAst;
    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;


    public Mashin() {

    }

    public Mashin(String mark) {
        this.mark = mark;
    }


    public void roshan() {
        ayaRoshanAst = true;
    }
    public void khamoosh() {
        ayaRoshanAst = false;
    }

    public void bazKardaneDar() {
        ayaDarBazAst = true;
    }
    public void bastaneDar() {
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }
}

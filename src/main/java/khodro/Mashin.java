package khodro;

public class Mashin extends Khodro {

    boolean ayaDarBazAst;
    String mark;
    Ranande ranande;


    public Mashin() {

    }

    public Mashin(String mark) {
        this.mark = mark;
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

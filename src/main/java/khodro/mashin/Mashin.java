package khodro.mashin;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandughDar;

public class Mashin extends Khodro implements SandughDar, Gearbox {

    public static int tedadeForush;

    private boolean ayaDarBazAst;
    private String mark;
    private int gonjayeshSandugh;
    private Dande noeDande;
    private Ranande ranande;


    public Mashin() {

    }

    public Mashin(String mark) {

        this.mark = mark;
    }

    public Mashin(String mark, int gonjayesheSandugh, Dande noeDande) {
        this.mark = mark;
        this.gonjayeshSandugh = gonjayesheSandugh;
        this.noeDande = noeDande;
    }


    public void bazKardaneDar() {
        ayaDarBazAst = true;
    }
    public void bastaneDar() {
        ayaDarBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        if (!ayaDarBazAst && ayaRoshanAst) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getMark() {
        return this.mark;
    }

    @Override
    public Dande typeDande() {
        return noeDande;
    }

    @Override
    public int gonjayeshSandugh() {
        return 100;
    }

    @Override
    public String toString() {
        return "Mashin{" +
                "ayaDarBazAst=" + this.ayaDarBazAst +
                ", mark='" + this.mark + '\'' +
                ", gonjayeshSandugh=" + this.gonjayeshSandugh +
                ", noeDande='" + this.noeDande + '\'' +
                ", ranande=" + this.ranande +
                '}';
    }
}

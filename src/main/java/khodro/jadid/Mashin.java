package khodro.jadid;

import khodro.Gearbox;
import khodro.Khodro;
import khodro.Ranande;
import khodro.SandughDar;

public class Mashin extends Khodro implements SandughDar, Gearbox {

    private boolean ayaDarBazAst;
    private String mark;
    private int gonjayeshSandugh;
    private String noeDande;
    private Ranande ranande;


    public Mashin() {

    }

    public Mashin(String mark) {

        this.mark = mark;
    }

    public Mashin(String mark, int gonjayesheSandugh, String noeDande) {
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
    public String typeDande() {
        return "AutoMatic";
    }

    @Override
    public int gonjayeshSandugh() {
        return 100;
    }
}

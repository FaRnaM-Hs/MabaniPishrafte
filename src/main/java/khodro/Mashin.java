package khodro;

public class Mashin extends Khodro implements SandughDar, Gearbox {

    boolean ayaDarBazAst;
    String mark;
    int gonjayeshSandugh;
    String noeDande;
    Ranande ranande;


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

package khodro;

public abstract class Khodro {

    protected void protectedMethod() {
        System.out.println("This method is protected");
    }

    protected boolean ayaRoshanAst;

    public void roshan() {
        ayaRoshanAst = true;
    }

    public void khamoosh() {
        ayaRoshanAst = false;
    }

    public abstract boolean ayaDarHaleHarekatAst();

    public abstract String getMark();
}

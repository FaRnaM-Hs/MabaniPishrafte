package khodro;

public class Kashti extends Khodro {

    @Override
    protected void protectedMethod() {
        System.out.println("We are in Kashti class");
    }

    @Override
    public boolean ayaDarHaleHarekatAst() {
        protectedMethod();
        return false;
    }

    @Override
    public String getMark() {
        return "Kashti";
    }
}

package khodro;

public class Kashti extends Khodro {

    @Override
    public String toString() {
        //return "Kashti{}";
        return super.toString();
    }

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

    public void printReference() {
        System.out.println(this.toString());
    }

    public void printReferenceObject(Object object) {
        System.out.println(object);
    }

    public void printReferenceObject(String object) {
        System.out.println(object);
    }

    public void printReferenceObject(String object, int newParam) {
        System.out.println(object);
    }

    // Kar nemikonad
//    public String printReferenceObject(String object, int newParam) {
//        return "";
//    }
}

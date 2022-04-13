package calculator;

public class Calculator {
    public String add(String adadAval, String adadDovvom) {
        double d1 = Double.parseDouble(adadAval);
        double d2 = Double.parseDouble(adadDovvom);
        double result = d1 + d2;
        return String.valueOf(result);
    }

    public String submission(String adadAval, String adadDovvom) {
        double d1 = Double.parseDouble(adadAval);
        double d2 = Double.parseDouble(adadDovvom);
        double result = d1 - d2;
        return String.valueOf(result);
    }

    public String multiply(String adadAval, String adadDovvom) {
        double d1 = Double.parseDouble(adadAval);
        double d2 = Double.parseDouble(adadDovvom);
        double result = d1 * d2;
        return String.valueOf(result);
    }

    public String division(String adadAval, String adadDovvom) {
        double d1 = Double.parseDouble(adadAval);
        double d2 = Double.parseDouble(adadDovvom);
        double result = d1 / d2;
        return String.valueOf(result);
    }
}

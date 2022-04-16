package calculator;

public class Calculator {
    public String add(final String adadAval, final String adadDovvom) {
        final double d1 = Double.parseDouble(adadAval);
        final double d2 = Double.parseDouble(adadDovvom);
        final double result = d1 + d2;
        return String.valueOf(result);
    }

    public String submission(final String adadAval, final String adadDovvom) {
        final double d1 = Double.parseDouble(adadAval);
        final double d2 = Double.parseDouble(adadDovvom);
        final double result = d1 - d2;
        return String.valueOf(result);
    }

    public String multiply(final String adadAval, final String adadDovvom) {
        final double d1 = Double.parseDouble(adadAval);
        final double d2 = Double.parseDouble(adadDovvom);
        final double result = d1 * d2;
        return String.valueOf(result);
    }

    public String division(final String adadAval, final String adadDovvom) {
        final double d1 = Double.parseDouble(adadAval);
        final double d2 = Double.parseDouble(adadDovvom);
        final double result = d1 / d2;
        return String.valueOf(result);
    }
}

import org.junit.jupiter.api.Test;

public class MashinTest {

    class Mashin {

        boolean ayaMashinRoshanAst;
        boolean ayaDareMashinBazAst;
        double tool;
        double arz;
        String mark;


        void roshan() {
            System.out.println("Mashin roshan ast");
            ayaMashinRoshanAst = true;
        }
        void khamoosh() {
            System.out.println("Mashin khamoosh ast");
            ayaMashinRoshanAst = false;
        }

        void bazKardaneDar() {
            System.out.println("Dar baz ast");
            ayaDareMashinBazAst = true;
        }
        void bastaneDar() {
            System.out.println("Dar baster ast");
            ayaDareMashinBazAst = false;
        }

        void harekat() {
            if (!ayaDareMashinBazAst && ayaMashinRoshanAst) {
                System.out.println("Mashin dar hale harekat ast");
            } else {
                System.out.println("Mashin park ast");
            }
        }

    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MashinTest {

    @Test
    void MashinBayadHarekatKonadVaghtiDarBasteAstVaMashinRoshanAst() {

        Mashin benz = new Mashin("Benz");
        Mashin volvo = new Mashin("Volvo");

        boolean ayaBenzHarekatMikonad = benz.ayaDarHaleHarekatAst();
        volvo.roshan();
        boolean ayaVolvoHarekatMikonad = volvo.ayaDarHaleHarekatAst();

        Assertions.assertFalse(ayaBenzHarekatMikonad);
        Assertions.assertTrue(ayaVolvoHarekatMikonad);





//        Mashin mashin = new Mashin();
//        mashin.bazKardaneDar();
//        mashin.bastaneDar();
//
//        System.out.println("Dar Mashin baz ast? " + mashin.ayaDareMashinBazAst);
//
//        mashin.harekat();
//
//        System.out.println("--------------------------------------");
//
//        Mashin pride = new Mashin("Pride");
//        pride.roshan();
//        pride.bazKardaneDar();
//
//        mashin.harekat();

    }

    class Mashin {

        boolean ayaMashinRoshanAst;
        boolean ayaDareMashinBazAst;
        String mark;


        Mashin() {
            System.out.println("Yek Mashin bedune dadeh sakhte shod.");
        }

        Mashin(String mark) {
            this.mark = mark;
            System.out.println("Yek mashine " + this.mark + " sakhte shod.");
        }


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

        boolean ayaDarHaleHarekatAst() {
            if (!ayaDareMashinBazAst && ayaMashinRoshanAst) {
                System.out.println("Mashin dar hale harekat ast");
                return true;
            } else {
                System.out.println("Mashin park ast");
                return false;
            }
        }

    }

}

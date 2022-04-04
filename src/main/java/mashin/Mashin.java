package mashin;

public class Mashin {

    boolean ayaMashinRoshanAst;
    boolean ayaDareMashinBazAst;
    String mark;
    Ranande ranande;


    public Mashin() {
        System.out.println("Yek mashin.Mashin bedune dadeh sakhte shod.");
    }

    public Mashin(String mark) {
        this.mark = mark;
        System.out.println("Yek mashine " + this.mark + " sakhte shod.");
    }


    public void roshan() {
        System.out.println("mashin.Mashin roshan ast");
        ayaMashinRoshanAst = true;
    }
    public void khamoosh() {
        System.out.println("mashin.Mashin khamoosh ast");
        ayaMashinRoshanAst = false;
    }

    public void bazKardaneDar() {
        System.out.println("Dar baz ast");
        ayaDareMashinBazAst = true;
    }
    public void bastaneDar() {
        System.out.println("Dar baster ast");
        ayaDareMashinBazAst = false;
    }

    public boolean ayaDarHaleHarekatAst() {
        if (!ayaDareMashinBazAst && ayaMashinRoshanAst) {
            System.out.println("mashin.Mashin dar hale harekat ast");
            return true;
        } else {
            System.out.println("mashin.Mashin park ast");
            return false;
        }
    }
}

import khodro.mashin.Dande;
import khodro.mashin.Mashin;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

        String mark = args[0];
        String gonjayeshSandugh = args[1];
        Dande noeDande = Dande.valueOf(args[2]);

        Mashin mashin = new Mashin(mark, Integer.parseInt(gonjayeshSandugh), noeDande);

        if (mashin.ayaDarHaleHarekatAst()) {
            System.out.println("Mashin dar hale harekat ast");
        } else {
            System.out.println("Mashin park ast");
        }

        System.out.println(mashin.getMark());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Esme shoma chi hast?");
        String nam = scanner.nextLine();
        System.out.println("Lotfan senne khod ra vared konid:");
        String sen = scanner.nextLine();
        System.out.println("Dar che shahri zendegi mikonid?");
        String shahreMahaleSokunat = scanner.nextLine();

        System.out.println("Man " + nam + " hastam " + sen + " sale az " + shahreMahaleSokunat + ".");

        System.out.println("Payane Ejra");
    }
}

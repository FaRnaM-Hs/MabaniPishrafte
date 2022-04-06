package khodro;

public class NameKhodroChapKon {

    Khodro[] khodroha;

    public NameKhodroChapKon(Khodro[] khodroha) {
        this.khodroha = khodroha;
    }

    public String execute() {
        String nameKhodroHa = "";

        for (int i = 0; i < khodroha.length; i++) {
            Khodro khodro = khodroha[i];
            if (i != khodroha.length - 1) {
                nameKhodroHa = nameKhodroHa + khodro.getMark() + "-";
            } else {
                nameKhodroHa = nameKhodroHa + khodro.getMark();
            }
        }

        return nameKhodroHa;
    }
}

package enums;

public enum MadeInArmType {
    INTERIERIDZEVAVORUM("Ինտերիերի ձևավորում"),
    ARHESTEVDZERAGORCUTYUN("Արհեստ և ձեռագործություն"),
    SEXANISPASQ("Սեղանի սպասք"),
    ZARDER("Զարդեր"),
    PAYUSAKNEREVDRAMAPANAKNER("Պայուսակներ և դրամապանակներ");

    private String value;


    MadeInArmType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}

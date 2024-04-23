package enums;

public enum MarkType {
    QAXAQAYINAVTOBUS("Քաղաքային ավտոբուս"),
    MIJQAXAQAYINAVTOBUS("Միջքաղաքային ավտոբուս"),
    MIKROAVTOBUS("Միկրոավտոբուս"),
    DPROCAKANAVTOBUS("Դպրոցական ավտոբուս"),
    HERTAPOXIAVTOBUS("Հերթափոխի ավտոբուս"),
    ERTUXAYINAVTOBUS("Երթուղային ավտոբուս"),
    HATUKAVTOBUS("Հատուկ ավտոբուս"),
    TURISTAKANAVTOBUS("Տուրիստական ավտոբուս"),
    AYL("Այլ");

    private String value;

    MarkType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}

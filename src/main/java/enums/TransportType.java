package enums;

public enum TransportType {
    AVTOPAHESTAMASER("Ավտոպահեստամասեր"),
    AVTOMEQENANERACHURDIC("ԱՎտոմեքենաներ աճուրդից"),
    MeqenayiAudiuEvVideoHamakarg("Մեքենայի աուդիո և վիդեո համակարգ"),
    AVTOMEQENANER("Ավտոմեքենաներ"),
    AVTOAQSESUARNER("Ավտոաքսեսուարներ");

    private String value;


    TransportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

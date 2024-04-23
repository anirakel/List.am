package enums;

public enum EngineType {
    PETROL("Բենզին"),

    DIZEL("Դիզել"),

    HIBRID("Հիբրիդ"),

    ELECTRIIC("էլեկտրական");

    private String value;

    EngineType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

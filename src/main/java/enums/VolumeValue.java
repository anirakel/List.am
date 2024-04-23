package enums;

public enum VolumeValue {
    FIRSTVALUE("0.6 L"),
    SECONDVALUE("0.7 L"),
    THIRDVALUE("0.8 L"),
    FOURTHSIZE("0.8 L");

    private String value;

    VolumeValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

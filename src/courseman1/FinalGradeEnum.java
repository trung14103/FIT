package courseman1;

import java.util.HashMap;
import java.util.Map;

public enum FinalGradeEnum {

    P(1, "Pass"),
    F(2, "Failed"),
    G(3, "Good"),
    E(5, "Excellent"),
    ;

    private static final Map<Integer, String> BY_ATOMIC_NUMBER = new HashMap<>();

    static {
        for (FinalGradeEnum e : values()) {
            BY_ATOMIC_NUMBER.put(e.getCode(), e.getText());
        }
    }

    private String text;

    private int code;

    FinalGradeEnum(int code ,String text) {
        this.text = text;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String textOfCode(int code) {
        return BY_ATOMIC_NUMBER.get(code);
    }

}

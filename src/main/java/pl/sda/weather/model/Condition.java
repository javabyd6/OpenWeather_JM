package pl.sda.weather.model;

import java.util.StringJoiner;

/**
 * @author Juliusz Mueller
 */
public class Condition {

    private String text;
    private String icon;
    private long code;

    public Condition() {
    }

    public Condition(String text, String icon, long code) {
        this.text = text;
        this.icon = icon;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Condition.class.getSimpleName() + "[", "]").add("text='" + text + "'").add("icon='" + icon + "'").add("code=" + code).toString();
    }
}

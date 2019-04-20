package xyz.tangzekk.gojacksongo.se.jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterP {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    @JsonGetter("name")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

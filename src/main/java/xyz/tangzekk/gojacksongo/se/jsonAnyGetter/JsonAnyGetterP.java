package xyz.tangzekk.gojacksongo.se.jsonAnyGetter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class JsonAnyGetterP {
    private boolean success;

    private Map<String, Object> data;

    @JsonAnyGetter
    public Map<String, Object> getData() {
        return data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }



    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}

package xyz.tangzekk.gojacksongo.se.jsonRaw;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.Data;

@Data
public class JsonRaw {
    private String msg;
    @JsonRawValue
    private String data;
}

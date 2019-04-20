package xyz.tangzekk.gojacksongo.se.jsonSerialize;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@Data
public class JsonSerializeP {
    @JsonSerialize(using = MyNameSer.class)
    public String name;

}

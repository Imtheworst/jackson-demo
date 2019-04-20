package xyz.tangzekk.gojacksongo.se.jsonvalue;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class JsonValueP {
    private String bad1;
    private String bad2;
    @JsonValue
    private String useful;

}

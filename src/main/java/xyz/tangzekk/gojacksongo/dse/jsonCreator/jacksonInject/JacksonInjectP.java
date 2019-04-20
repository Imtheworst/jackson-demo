package xyz.tangzekk.gojacksongo.dse.jsonCreator.jacksonInject;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.OptBoolean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JacksonInjectP {
    @JacksonInject(value = "jcode",useInput = OptBoolean.FALSE )
    private Integer code;
    private String msg;

}

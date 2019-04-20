package xyz.tangzekk.gojacksongo.se.jsonPOrder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Data
@JsonPropertyOrder({"status8","status4"})
public class JsonPropOrder {

    private int status1;
    private int status2;
    private int status3;
    private int status4;
    private int status5;
    private int status6;
    private int status7;
    private int status8;

}

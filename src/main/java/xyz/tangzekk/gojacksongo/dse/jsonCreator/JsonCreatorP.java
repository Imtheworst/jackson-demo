package xyz.tangzekk.gojacksongo.dse.jsonCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@ToString
public class JsonCreatorP {
    @JsonProperty("okk")
    private boolean success;
    @JsonProperty("msgg")
    private String msg;

    @JsonCreator
    public JsonCreatorP(@JsonProperty("ok") boolean success, @JsonProperty("info") String msg) {
        this.success = success;
        this.msg = msg;
    }

    @JsonCreator
    public JsonCreatorP(@JsonProperty("single") String msg) {

        this.msg = msg;
    }
}

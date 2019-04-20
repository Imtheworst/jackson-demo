package xyz.tangzekk.gojacksongo.dse.jsonCreator.jdse;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.Date;
@Data
public class JsonDeserP {

    private Integer code;
    @JsonDeserialize(using = MyJsonDateDse.class)
    private Date date;

}

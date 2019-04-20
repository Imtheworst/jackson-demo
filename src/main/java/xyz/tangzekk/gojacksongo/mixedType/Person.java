package xyz.tangzekk.gojacksongo.mixedType;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type"

)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Chinese.class,name = "chinese"),
        @JsonSubTypes.Type(value = Japanese.class,name = "japanese")
})
public class Person {

}

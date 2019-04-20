package xyz.tangzekk.gojacksongo.dse.jsonCreator.jsonAnySetter;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@ToString@Data
public class JsonAnySetterP {

    private String school;
//    private Map<String, String> stringMap = new HashMap<>();
    private Map<String, Integer> integerMap=new HashMap<>();
//    private Map<String, Object> objectMap = new HashMap<>();


//    @JsonAnySetter
//    public void add(String key, String value) {
//        stringMap.put(key, value);
//    }
    @JsonAnySetter
    public void add12(String key, Integer value) {
        integerMap.put(key, value);
    }
//    @JsonAnySetter
//    public void addObj(String key, Object value) {
//        objectMap.put(key, value);
//    }
}

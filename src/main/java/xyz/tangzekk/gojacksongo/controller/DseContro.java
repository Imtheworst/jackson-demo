package xyz.tangzekk.gojacksongo.controller;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.tangzekk.gojacksongo.dse.jsonCreator.JsonCreatorP;
import xyz.tangzekk.gojacksongo.dse.jsonCreator.jdse.JsonDeserP;
import xyz.tangzekk.gojacksongo.dse.jsonCreator.jsonAnySetter.JsonAnySetterP;
import xyz.tangzekk.gojacksongo.mixedType.Chinese;
import xyz.tangzekk.gojacksongo.mixedType.Earth;
import xyz.tangzekk.gojacksongo.mixedType.Japanese;
import xyz.tangzekk.gojacksongo.se.jsonView.JsonViewP;
import xyz.tangzekk.gojacksongo.se.jsonView.UserView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DseContro {

    @PostMapping("/jsoncreator")
    public String jsoncreator(@RequestBody JsonCreatorP p) {
        System.out.println(p);
        return p.toString();
    }

    @PostMapping("/jacksoninject")
    public String jacksoninject(@RequestBody JacksonInject p) {
        System.out.println(p);
        return p.toString();
    }

    @PostMapping("/jsonanysetter")
    public String jsonAnySetter(@RequestBody JsonAnySetterP p) {
        System.out.println(p);
        return p.toString();
    }

    @PostMapping("/jsondse")
    public String jsondse(@RequestBody JsonDeserP p) {
        System.out.println(p);
        return p.toString();
    }

    @GetMapping("/jsontype")
    public Map<String, Object> jsonType() {
        Earth e1 = new Earth();
        Chinese chinese = new Chinese("天安门", "四川");
        e1.setPerson(chinese);
        Earth e2 = new Earth();
        Japanese japanese = new Japanese("和服", "富士山");
        e2.setPerson(japanese);
        Map<String, Object> map = new HashMap<>();
        map.put("china", e1);
        map.put("jap", e2);


        System.out.println(map);
        return map;
    }

    @PostMapping("/jsontypeds")
    public String jsontypeDs(@RequestBody @JsonSubTypes.Type(value = Chinese.class) Earth p) {
        System.out.println(p);
        return p.toString();
    }

    @GetMapping("/jsonview")
    public @JsonView(UserView.class) JsonViewP jsonview() {
        JsonViewP p = new JsonViewP("TOM", "12345");
        return p;
    }


}

package xyz.tangzekk.gojacksongo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.tangzekk.gojacksongo.se.jsonAnyGetter.JsonAnyGetterP;
import xyz.tangzekk.gojacksongo.se.jsonGetter.JsonGetterP;
import xyz.tangzekk.gojacksongo.se.jsonPOrder.JsonPropOrder;
import xyz.tangzekk.gojacksongo.se.jsonRaw.JsonRaw;
import xyz.tangzekk.gojacksongo.se.jsonSerialize.JsonSerializeP;
import xyz.tangzekk.gojacksongo.se.jsonvalue.JsonValueP;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SeContro {
    @GetMapping("/jsonanygetter")
    public JsonAnyGetterP jsonanygetter() {
        JsonAnyGetterP p = new JsonAnyGetterP();
        p.setSuccess(true);
        Map<String, Object> map = new HashMap<>();
        map.put("zjhm", 11012131123L);
        map.put("ok?", true);
        map.put("time", LocalDateTime.now());
        p.setData(map);
        return p;
    }

    @GetMapping("/jsongetter")
    public JsonGetterP jsonGetterP() {
        JsonGetterP p = new JsonGetterP();
        p.setCode(400);
        p.setMessage("哈哈哈哈");
        return p;
    }

    @GetMapping("jsonorder")
    public JsonPropOrder order() {
        JsonPropOrder r = new JsonPropOrder(1, 1, 1, 1, 1, 1, 1, 1);
        return r;
    }

    @GetMapping("jsonraw")
    public JsonRaw jsonraw() {
        JsonRaw r = new JsonRaw();
        r.setData("{\n" +
                "  \"test\":\"2019年4月19日\",\n" +
                "  \"time\":\"2019年4月19日19:16:05\"\n" +
                "}");

//        r.setData("\"dasd\":\"das\"");
        return r;
    }

    @GetMapping("jsonvaluep")
    public JsonValueP jsonvaluep() {
        JsonValueP p = new JsonValueP("xx", "xxx", "useful");
        return p;

    }    @GetMapping("jsonserializep")
    public JsonSerializeP jsonserializep() {
        JsonSerializeP p = new JsonSerializeP();
        p.setName("admin");
        return p;

    }
}

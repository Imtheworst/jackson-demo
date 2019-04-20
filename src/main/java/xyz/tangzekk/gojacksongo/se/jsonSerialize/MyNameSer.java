package xyz.tangzekk.gojacksongo.se.jsonSerialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class MyNameSer extends JsonSerializer<String>  {


    @Override
    public void serialize(String value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        if (value.equals("admin")) {
            gen.writeNumber(1L);

        }else {
            gen.writeNumber("999");

        }
    }
}

package xyz.tangzekk.gojacksongo.dse.jsonCreator.jdse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyJsonDateDse extends JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String text = p.getText();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        Date parse = null;
        try {
            parse = format.parse(text);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }
}

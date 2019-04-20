package xyz.tangzekk.gojacksongo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import xyz.tangzekk.gojacksongo.se.jsonAnyGetter.JsonAnyGetterP;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class GojacksongoApplicationTests {

    @Test
    public void contextLoads() throws JsonProcessingException {

        JsonAnyGetterP p = new JsonAnyGetterP();
        p.setSuccess(true);
        Map<String, Object> map = new HashMap<>();
        map.put("zjhm", 11012131123L);
        map.put("ok?", true);
        map.put("time", LocalDateTime.now());
        Map pp = new HashMap();
        pp.put("das", "dasd");
        p.setData(map);


        String result = new ObjectMapper().writeValueAsString(p);
        System.out.println(result);

    }

}

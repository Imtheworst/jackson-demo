package xyz.tangzekk.gojacksongo.mixedType;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("japanses")@Data@AllArgsConstructor@NoArgsConstructor
public class Japanese extends Person {
    private String heFu;
    private String fuShiShan;
}

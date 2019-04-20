package xyz.tangzekk.gojacksongo.mixedType;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("chinese")@Data@AllArgsConstructor@NoArgsConstructor
public class Chinese extends Person {
    private String tianAnMen;
    private String siChuan;
}

package xyz.tangzekk.gojacksongo.se.jsonView;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class JsonViewP {
    @JsonView(UserView.class)
    private String name;
    @JsonView(AdminView.class)
    private String password;
}

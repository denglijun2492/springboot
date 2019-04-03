package denglj.learn.demo.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(MyConfig2.class)
public class ConfigController {
    @Autowired
    private MyConfig config;
    @Autowired
    private MyConfig2 config2;

    @Value("${my.address2}")
    private String address;
    @Autowired
    private Environment env;

    @RequestMapping(path = "/config")
    public String config() throws JsonProcessingException {
        System.out.println(env.getProperty("my.address"));
        System.out.println(address);
        return new ObjectMapper().writeValueAsString(config);
    }
}

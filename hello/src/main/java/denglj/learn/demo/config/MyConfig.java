package denglj.learn.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * https://blog.csdn.net/swpu_ocean/article/details/79243591
 */
//@Configuration
@Component
@ConfigurationProperties(prefix = "my")
@PropertySource(value = {"classpath:my-config.properties"})
public class MyConfig {
    private String name = "a";
    private String address = "b";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

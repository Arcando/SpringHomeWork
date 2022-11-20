import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("java")
@PropertySource("head.properties")
public class SpringConfig {
    @Scope("prototype")
    @Bean("headBean")
    public Head head() {
        return new Head();
    }

    @Scope("singleton")
    @Bean("hydraBean")
    public Hydra hydra() {
        return new Hydra(head());
    }
}

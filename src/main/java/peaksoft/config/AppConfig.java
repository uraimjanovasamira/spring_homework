package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    public static Ocean1 getOcean(Island2 island2) {
        return new Ocean1(island2);
    }

    @Bean
    public static Egg6 getEgg6(Needle7 needle7){
        return new Egg6(needle7);
    }
    @Bean
    public static Needle7 getNeedle7(Deth8 deth8){
        return new Needle7(deth8);
    }




}
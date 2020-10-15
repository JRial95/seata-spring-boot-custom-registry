package io.jrial95.seataspringbootcustomregistry;

import io.seata.config.Configuration;
import io.seata.config.ConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@SpringBootApplication
public class SeataSpringBootCustomRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataSpringBootCustomRegistryApplication.class, args);

        Configuration configuration = ConfigurationFactory.getInstance();

        Properties properties = new Properties();
        try (InputStream input = SeataSpringBootCustomRegistryApplication.class.getClassLoader().getResourceAsStream(
                "demo_custom_config.properties")) {
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String name : properties.stringPropertyNames()) {
            System.out.println("---> key: " + name + ", value: " + configuration.getConfig(name));
        }
    }
}

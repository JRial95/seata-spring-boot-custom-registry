package io.jrial95.seataspringbootcustomregistry.config;

import io.seata.common.loader.LoadLevel;
import io.seata.config.Configuration;
import io.seata.config.ConfigurationProvider;

@LoadLevel(name = "DemoCustomConfig")
public class DemoCustomConfigurationProvider implements ConfigurationProvider {
    @Override
    public Configuration provide() {
        return new DemoCustomConfiguration("demo_custom_config.properties");
    }
}
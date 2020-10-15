package io.jrial95.seataspringbootcustomregistry.config;

import io.seata.config.AbstractConfiguration;
import io.seata.config.ConfigurationChangeListener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class DemoCustomConfiguration extends AbstractConfiguration {

    private final Properties properties;

    public DemoCustomConfiguration(String name) {
        try (InputStream input = DemoCustomConfiguration.class.getClassLoader().getResourceAsStream(name)) {
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getTypeName() {
        return "DemoCustomConfig";
    }

    @Override
    public String getLatestConfig(String dataId, String defaultValue, long timeoutMills) {
        return properties.getProperty(dataId, defaultValue);
    }

    @Override
    public boolean putConfig(String dataId, String content, long timeoutMills) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean putConfigIfAbsent(String dataId, String content, long timeoutMills) {
        return false;
    }

    @Override
    public boolean removeConfig(String dataId, long timeoutMills) {
        return false;
    }

    @Override
    public void addConfigListener(String dataId, ConfigurationChangeListener listener) {
    }

    @Override
    public void removeConfigListener(String dataId, ConfigurationChangeListener listener) {
    }

    @Override
    public Set<ConfigurationChangeListener> getConfigListeners(String dataId) {
        return null;
    }
}
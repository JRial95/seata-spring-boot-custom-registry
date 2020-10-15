package io.jrial95.seataspringbootcustomregistry.registry;

import io.seata.common.loader.LoadLevel;
import io.seata.config.ConfigChangeListener;
import io.seata.discovery.registry.RegistryProvider;
import io.seata.discovery.registry.RegistryService;

@LoadLevel(name = "DemoCustomRegistry")
public class DemoCustomRegistryProvider implements RegistryProvider {

    @Override
    public RegistryService<ConfigChangeListener> provide() {
        return DemoCustomRegistryService.getInstance();
    }
}

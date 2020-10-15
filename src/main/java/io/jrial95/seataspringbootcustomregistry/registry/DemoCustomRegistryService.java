package io.jrial95.seataspringbootcustomregistry.registry;

import io.seata.config.ConfigChangeListener;
import io.seata.discovery.registry.RegistryService;

import java.net.InetSocketAddress;
import java.util.List;

public class DemoCustomRegistryService implements RegistryService<ConfigChangeListener> {

    private static volatile DemoCustomRegistryService instance;

    private DemoCustomRegistryService() {
    }

    static DemoCustomRegistryService getInstance() {
        if (instance == null) {
            synchronized (DemoCustomRegistryService.class) {
                if (instance == null) {
                    instance = new DemoCustomRegistryService();
                }
            }
        }
        return instance;
    }

    @Override
    public void register(InetSocketAddress address) {
    }

    @Override
    public void unregister(InetSocketAddress address) {
    }

    @Override
    public void subscribe(String cluster, ConfigChangeListener listener) {
    }

    @Override
    public void unsubscribe(String cluster, ConfigChangeListener listener) {
    }

    @Override
    public List<InetSocketAddress> lookup(String key) throws Exception {
        throw new Exception("Yeah! The custom registry is working.");
    }

    @Override
    public void close() {
    }
}

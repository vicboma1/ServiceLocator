package cache;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public interface CacheMap {
    <T> Service get(Class<T> _class);

    <T> void put(Class<T> _class, Service service);
}

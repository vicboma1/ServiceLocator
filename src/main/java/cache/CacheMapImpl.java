package cache;


import service.Service;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by vicboma on 30/10/15.
 */
public class CacheMapImpl implements CacheMap {

    private Map<Class, Service> map;

    public static CacheMapImpl create() {
        return new CacheMapImpl(new Hashtable());
    }

    public CacheMapImpl(Map<Class, Service> map) {
        this.map = map;
    }

    @Override
    public <T> Service get(final Class<T> _class) {
        System.out.println("Get cached! "+_class.getName());
        return map.get(_class);
    }

    @Override
    public <T> void put(final Class<T> _class, final Service service) {
        map.put(_class, service);
        System.out.println("Put cached! "+_class.getName());
    }

}

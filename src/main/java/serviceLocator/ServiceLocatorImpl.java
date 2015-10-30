package serviceLocator;

import cache.CacheMap;
import context.Context;
import service.Service;

import java.lang.reflect.Method;

/**
 * Created by vicboma on 30/10/15.
 */
public class ServiceLocatorImpl implements ServiceLocator {

    private CacheMap cacheMap;
    private Context context;

    public static ServiceLocator create(final CacheMap cacheMap, final Context context){
        return new ServiceLocatorImpl(cacheMap, context);
    }

    public ServiceLocatorImpl(final CacheMap cacheMap,final Context context) {
        this.cacheMap = cacheMap;
        this.context = context;
    }

    @Override
    public <T extends Service> Service getService(Class<T> _class){
        final Service service = this.cacheMap.get(_class);
        if(service != null)
            return service;

        return addNewServiceToCache(_class);
    }

    private <T extends Service> Service addNewServiceToCache(Class<T> _class) {
        final Service service = context.lookup(_class);
        for (Method methods : service.getClass().getMethods()){
            if(methods.getName().equals(Service.EXECUTE))
            {
                cacheMap.put(_class,service);
                break;
            }
        }

        return service;
    }
}

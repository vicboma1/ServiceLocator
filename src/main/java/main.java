import cache.CacheMap;
import cache.CacheMapImpl;
import context.Context;
import context.ContextImpl;
import service.Service;
import serviceLocator.ServiceLocator;
import serviceLocator.ServiceLocatorImpl;
import services.Servicio1;
import services.Servicio2;
import services.Servicio3;

/**
 * Created by vicboma on 30/10/15.
 */
public class main {

    public static void main(String arg[]) {
        final ServiceLocator serviceLocator = configuration();
        createInstance(serviceLocator);
        instanceCached(serviceLocator);
    }

    private static ServiceLocator configuration() {
        final CacheMap cacheMap = CacheMapImpl.create();
        final Context context = ContextImpl.create();
        return ServiceLocatorImpl.create(cacheMap, context);
    }

    private static void instanceCached(ServiceLocator serviceLocator) {
        final Service _servicio1 = serviceLocator.getService(Servicio1.class);
        _servicio1.execute();
        final Service _servicio2 = serviceLocator.getService(Servicio2.class);
        _servicio2.execute();
        final Service _servicio3 = serviceLocator.getService(Servicio3.class);
        _servicio3.execute();
    }

    private static void createInstance(ServiceLocator serviceLocator) {
        final Service servicio1 = serviceLocator.getService(Servicio1.class);
        servicio1.execute();
        final Service servicio2 = serviceLocator.getService(Servicio2.class);
        servicio2.execute();
        final Service servicio3 = serviceLocator.getService(Servicio3.class);
        servicio3.execute();
    }

}

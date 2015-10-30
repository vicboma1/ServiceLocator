package serviceLocator;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public interface ServiceLocator {
    <T extends Service> Service getService(Class<T> _class);
}

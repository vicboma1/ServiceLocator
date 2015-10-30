package context;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public interface Context {
    <T> Service lookup(Class<T> _class);
}

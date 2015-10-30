package context;

import service.Service;
import services.Servicio1;
import services.Servicio2;
import services.Servicio3;

/**
 * Created by vicboma on 30/10/15.
 */
public class ContextImpl implements Context {

    public static Context create(){
        return new ContextImpl();
    }

    public ContextImpl() {
    }

    @Override
    public <T> Service lookup(Class<T> _class) {
        if (createInstance(_class))
            try {
                final Object obj =  _class.newInstance();
                return (Service)obj;
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        return null;
    }

    private <T> boolean createInstance(Class<T> aClass) {
        if (aClass == Servicio1.class || aClass == Servicio2.class || aClass == Servicio3.class){
            System.out.println("Creating a new "+aClass.getName()+" instance.");
            return true;
        }
        return false;
    }

}

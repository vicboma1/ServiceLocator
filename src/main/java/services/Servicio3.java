package services;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public class Servicio3 implements Service {

    public Servicio3() {
    }

    @Override
    public void execute() {
        System.out.println("Servicio 3 executado!!!");
    }
}

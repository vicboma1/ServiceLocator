package services;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public class Servicio2 implements Service {

    public Servicio2() {
    }

    @Override
    public void execute() {
        System.out.println("Servicio2 executado!!!");
    }
}

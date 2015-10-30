package services;

import service.Service;

/**
 * Created by vicboma on 30/10/15.
 */
public class Servicio1 implements Service {

    public Servicio1() {
    }

    @Override
    public void execute() {
        System.out.println("Servicio 1 executado!!!");
    }
}

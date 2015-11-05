/*
 */
package com.ramiatech.resttestproject.services;

import com.ramiatech.resttestproject.domain.Vehicle;
import java.util.List;
import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Farid
 */

public class VehicleServiceTest {
    
    private static VehicleService vehicleService;
    
    @BeforeClass
    public static void init(){
        vehicleService = new VehicleService();
    }
    
    @Test
    public void testGetAllVehicles(){
        List<Vehicle>  vehicles = vehicleService.getAllVehicles();
        Assert.assertEquals(11, vehicles.size());
        Vehicle vehicle = new Vehicle(1L, null, null);
        Assert.assertEquals(vehicle, vehicles.get(0));
    }
}

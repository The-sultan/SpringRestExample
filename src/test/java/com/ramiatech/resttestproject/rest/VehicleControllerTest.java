package com.ramiatech.resttestproject.rest;

import com.ramiatech.resttestproject.domain.Vehicle;
import com.ramiatech.resttestproject.services.VehicleService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;


/**
 * @author Farid
 */
public class VehicleControllerTest {
    
    private VehicleController vehicleController;
    
    @Mock
    private static VehicleService vehicleService;
    
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        vehicleController =  new VehicleController();
        ReflectionTestUtils.setField(vehicleController, "vehicleService", vehicleService);
        
    }
    
    @Test
    public void testGetVehicleById(){
        Vehicle expectedVehicle = new Vehicle(1L, null, null);
        Mockito.when(vehicleService.getVehicleById(Mockito.anyLong())).thenReturn(expectedVehicle);
        Vehicle vehicle = vehicleController.getVehicleById(1L);
        Assert.assertEquals(expectedVehicle, vehicle);
    }
    
}

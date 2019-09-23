package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import org.junit.*;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class FrightMachineTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    private FrightMachine machine;
    private Horn horn;
    private Strobe strobe;
    private Camera camera;
    private AccessoryAdapter cameraAccessory;

    @Before
    public void setUp() throws Exception {
        machine = new FrightMachine();
        horn = new Horn();
        strobe = new Strobe();
        camera = new Camera();
        cameraAccessory = new AccessoryAdapter(camera::snapPhotos, 5);

        machine.addAccessory(horn);
        machine.addAccessory(strobe);
        machine.addAccessory(cameraAccessory);
    }

    @Test
    public void whenMotionIsDetectedExpectedPluginsKickOff() throws Exception {
        machine.simulateMotion();
        assertThat(systemOutRule.getLog(), allOf(containsString("BEEEEEEEP"),
                                                 containsString("Flashing lights"),
                                                 containsString("Photo #5 taken")));
    }

    @After
    public void cleanUp() {
        machine.removeAccessory(horn);
        machine.removeAccessory(strobe);
        machine.removeAccessory(cameraAccessory);
    }
}
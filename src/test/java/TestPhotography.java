import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPhotography {

    @Test
    public void testIfANewCameraIsCreated() {
        Lens lens = new Lens(30, 70);
        Camera camera = new Camera();
        camera.setBrand("nikon2200");
        camera.setMegaPixels(18);
        camera.setDisplaySize(60);
        camera.setColored(true);
        camera.setLens(lens);
        assertEquals("nikon2200", camera.getBrand());
        assertEquals(18, camera.getMegaPixels());
        assertEquals(60, camera.getDisplaySize());
        assertTrue(camera.isColored());
        assertEquals(lens, camera.getLens());
    }

    @Test
    public void testIfANewLensIsCreated() {
        Lens lens = new Lens(30, 70);
        assertEquals(30, lens.minimumFoucsLength);
        assertEquals(70, lens.maximumFocusLength);
    }

    @Test
    public void testIfmaximumFocusLengthIsAlwaysBiggerThanMinimumFocusLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            Lens zoomLens = new Lens(70, 30);
        });
    }

    @Test
    public void testIfCounterIsFunctional() {
        Camera camera = new Camera();
        assertEquals(1, camera.getCameraId());
        Camera camera1 = new Camera();
        assertEquals(2, camera1.getCameraId());
        Lens lens = new Lens(30,70);
        Camera camera2 = new Camera("Nikon", 45, 45, true, lens);
        assertEquals(1, lens.lensId);
        assertEquals(3, camera2.getCameraId());

    }

    @Test
    public void testIfLensIsOverwritten() {
        Lens lens = new Lens(30, 70);
        Lens lensNew = new Lens(50, 90);
        Camera camera = new Camera("nikon2200", 18, 60, true, lens);
        camera.setLens(lensNew);
        assertEquals(lensNew, camera.getLens());
    }

}

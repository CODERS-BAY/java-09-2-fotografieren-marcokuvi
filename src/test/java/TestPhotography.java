import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPhotography {

    @Test
    public void testIfANewCameraIsCreated() {
        Lens lens = new Lens(30, 70);
        Camera camera = new Camera("nikon2200", 18, 60, true, lens);
        assertEquals("nikon2200", camera.brand);
        assertEquals(18, camera.megaPixels);
        assertEquals(60, camera.displaySize);
        assertTrue(camera.colored);
        assertEquals(lens, camera.lens);
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
        Lens lens = new Lens(30, 70);
        Camera camera = new Camera("nikon2200", 18, 60, true, lens);
        assertEquals(1, camera.cameraId);
    }

    @Test
    public void testIfLensIsOverwritten() {
        Lens lens = new Lens(30, 70);
        Lens lensNew = new Lens(50, 90);
        Camera camera = new Camera("nikon2200", 18, 60, true, lens);
        camera.lens = lensNew;
        assertEquals(lensNew, camera.lens);
    }
}

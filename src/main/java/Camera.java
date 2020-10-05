public class Camera {

    public int cameraId;
    public String brand;
    public int megaPixels;
    public int displaySize;
    public boolean colored;
    public Lens lens;

    private static int CAMERA_COUNTER = 0;


    public Camera(String brand, int megaPixels, int displaySize, boolean colored, Lens lens) {
        CAMERA_COUNTER++;
        this.cameraId = CAMERA_COUNTER;
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySize = displaySize;
        this.colored = colored;
        this.lens = lens;

    }

    @Override
    public String toString() {
        return "Camera(" +
                "cameraId=" + cameraId +
                ", brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySize +
                ", colored=" + colored +
                ", lens=" + lens +
                ')';
    }
}

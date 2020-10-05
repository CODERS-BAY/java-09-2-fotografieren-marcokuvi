public class Main {

    public static void main(String[] args) {
        Lens normalLens  = new Lens(40,60);
        Lens telephotoLens = new Lens(65,1200);
        Lens wideAngleLens = new Lens(14,35);
        Lens fishEyeLens = new Lens(8,16);
        Lens zoomLens = new Lens(30,70);


        Camera nikon2200 = new Camera("Nikon2200", 24, 65, true, normalLens);
        Camera sonyAlpha6000 = new Camera("Sony AlPHA 6000", 16, 50, true, telephotoLens);
        Camera kanon1600 = new Camera("Kanon 1600", 14, 33, false, wideAngleLens);
        Camera olympus16 = new Camera("Olympus 16", 18, 45, true, fishEyeLens);

        nikon2200.lens = zoomLens;

        System.out.println(nikon2200);
        System.out.println(sonyAlpha6000);
        System.out.println(kanon1600);
        System.out.println(olympus16);
    }
}

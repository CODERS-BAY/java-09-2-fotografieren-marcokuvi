public class Main {

    public static void main(String[] args) {
        Lens normalLens  = new Lens(40,60);
        Lens telephotoLens = new Lens(65,1200);
        Lens wideAngleLens = new Lens(14,35);
        Lens fishEyeLens = new Lens(8,16);
        Lens zoomLens = new Lens(30,70);

        Camera nikon2200 = new Camera();
        nikon2200.setBrand("Nikon 2200");
        nikon2200.setMegaPixels(20);
        nikon2200.setDisplaySize(64);
        nikon2200.setColored(true);
        nikon2200.setLens(normalLens);
        System.out.println(nikon2200.getBrand());

        Camera sonyAlpha6000 = new Camera();
        sonyAlpha6000.setBrand("Sony ALPHA 6000");
        sonyAlpha6000.setMegaPixels(16);
        sonyAlpha6000.setDisplaySize(50);
        sonyAlpha6000.setColored(true);
        sonyAlpha6000.setLens(telephotoLens);
        System.out.println(nikon2200.getMegaPixels());

        Camera kanon1600 = new Camera();
        kanon1600.setBrand("Kanon 1600");
        kanon1600.setMegaPixels(14);
        kanon1600.setDisplaySize(33);
        kanon1600.setColored(false);
        kanon1600.setLens(wideAngleLens);
        System.out.println(kanon1600.isColored());

        Camera olympus16 = new Camera();
        olympus16.setBrand("Olympus 16");
        olympus16.setMegaPixels(18);
        olympus16.setDisplaySize(45);
        olympus16.setColored(true);
        olympus16.setLens(fishEyeLens);
        System.out.println(olympus16.getLens());


        nikon2200.setLens(zoomLens);

        System.out.println(nikon2200);
        System.out.println(sonyAlpha6000);
        System.out.println(kanon1600);
        System.out.println(olympus16);

    }
}

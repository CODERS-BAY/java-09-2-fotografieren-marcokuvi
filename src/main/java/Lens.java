public class Lens {

    public int lensId;
    public int minimumFoucsLength;
    public int maximumFocusLength;


    private static int LENS_COUNTER;

    public Lens(int minimumFoucsLength, int maximumFocusLength) {
        LENS_COUNTER++;
        this.lensId = LENS_COUNTER;
        if (maximumFocusLength > minimumFoucsLength) {
            this.minimumFoucsLength = minimumFoucsLength;
            this.maximumFocusLength = maximumFocusLength;
        } else {
            throw new IllegalArgumentException("Minimum focus length is bigger than Maximum focus length");
        }

    }

    @Override
    public String toString() {
        return "Lens(" +
                "lensId=" + lensId +
                ", minimumFoucsLength=" + minimumFoucsLength +
                ", maximumFocusLength=" + maximumFocusLength +
                ')';
    }
}

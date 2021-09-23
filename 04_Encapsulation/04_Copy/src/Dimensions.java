public class Dimensions {
    private final int height;
    private final int width;
    private final int length;

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void amount() {
        System.out.println("Объём груза: " + (height * width * length));
    }
}

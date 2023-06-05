package Box;

public class box {
    public double width;
    public double height;
    public double length;

    public box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

        double volume = length * width * height;
        System.out.println("Объём коробки: " + volume);

    }
}
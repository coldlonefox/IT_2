package Tasks.Lms.Exception_task_lms.models.Cylinder;

public class Cylinder {
    private int length, width, height,radius;

    public Cylinder() {
    }

    public Cylinder(int length, int width, int height, int radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }
}

package Tasks.Shape_lms;

import java.util.Random;

public class RedShape extends Shape{
    @Override
    public double getPerimeter() {
        Random random = new Random();
        return random.nextDouble();
    }
}

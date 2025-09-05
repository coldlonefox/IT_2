package Tasks.Shape_lms;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Shape[] shape = {
                new WhiteShape(),
                new BlackShape(),
                new GreenShape(),
                new RedShape(),
                new BlueShape()
        };
        System.out.println("~~~~Shape~~~~~");
        int index = 0;
        for (Shape shape1 : shape){
            index++;
            System.out.print(index+"  ");
            System.out.print(shape1.getClass()+"   : ");
            System.out.println(shape1.getPerimeter());
        }
    }
}

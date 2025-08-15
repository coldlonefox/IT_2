package oop.tasks.task5_Flower;

public class Main {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        flower1.flowerName = "Роза";
        flower1.freshness = 5L;
        flower1.price = 900L;

        Flower flower2 = new Flower();
        flower2.flowerName = "Тюльпан";
        flower2.freshness = 4L;
        flower2.price = 800L;

        Flower flower3 = new Flower();
        flower3.flowerName = "Ромашка";
        flower3.freshness = 3L;
        flower3.price = 700L;

        Flower flower4 = new Flower();
        flower4.flowerName = "Кызгалдак";
        flower4.freshness = 2L;
        flower4.price = 600L;

        Flower flower5 = new Flower();
        flower5.flowerName = "Байчечекей";
        flower5.freshness = 14L;
        flower5.price = 4500L;

        Flower[] flowers = {flower1,flower2,flower3,flower4,flower5};


    }
}
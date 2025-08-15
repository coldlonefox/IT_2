package oop.tasks.task5_Flower;

public class Flower {
    String flowerName;
    Long freshness;
    Long price;

    public void getInfoFlowers (Flower... flowers){
        Long priceMax = flowers[0].price;
        for(Flower flower : flowers){
            if (flower.price > priceMax) {
                priceMax = flower.price;
            }
        }
        System.out.println("\n~~~~~~~Max Price~~~~~");
        System.out.println("Максимальный цена: "+priceMax+"\n");
        for (Flower flower : flowers){
            System.out.println("~~~~~~~Flowers~~~~~~~");
            System.out.println("\nFlowerName: " +flower.flowerName+"\n"+
                    "Freshness: " +flower.freshness+"\n"+
                    "Price: "+flower.price+"\n");
        }
    }

}

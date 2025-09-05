package Tasks.Lms.Animal_lms;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Shark(Shark.nameShark,"White",5,"Male"),
                new Shark(Shark.nameShark,"Blue",8,"Male"),
                new Shark(Shark.nameShark,"Black",12,"Female"),
                new Turtle(Turtle.nameTurtle,"White",45,"Female"),
                new Turtle(Turtle.nameTurtle,"Green",25,"Female"),
                new Turtle(Turtle.nameTurtle,"Blue",12,"Male"),
                new Eagle(Eagle.nameEagle,"White",12,"Male"),
                new Eagle(Eagle.nameEagle,"Brown",25,"Female"),
                new Eagle(Eagle.nameEagle,"Black",8,"Male"),
        };
        Animal[] sharks = new Shark[3];
        Animal[] turtles = new Turtle[3];
        Animal[] eagles = new Eagle[3];
        int sharkIndex1 = 0;
        int turtleIndex1 = 0;
        int eagleIndex1 = 0;

        for (Animal animal : animals){
            if (animal instanceof Shark){
                if (sharkIndex1 == 2) {
                    System.out.println("\n"+animal.getClass());
                }
                sharks[sharkIndex1++] = animal;
            } else if (animal instanceof Turtle) {
                if (turtleIndex1 == 2) {
                    System.out.println(animal.getClass());
                }
                turtles[turtleIndex1++] = animal;
            } else if (animal instanceof  Eagle) {
                if (eagleIndex1 == 2){
                    System.out.println(animal.getClass());
                }
                eagles[eagleIndex1++] = animal;
            }
        }

        System.out.println("\n~~~~~~Method Animals~~~~~~~");
        Shark.attack();
        Turtle.swim();
        Eagle.fly();

        System.out.print("\nSearch by color : ");
        String color = "White";
        System.out.print("White\n");
        System.out.println("~~~~~~~~Animal~~~~~~~~");
        for (Animal animal : animals){
            if (animal.getColor().equalsIgnoreCase(color)){
                System.out.println(animal);
            }
        }
        System.out.print("\nSearch by gender : ");
        String gender = "Male";
        System.out.print("Male\n");
        System.out.println("~~~~~~~~Animal~~~~~~~~");
        for (Animal animal : animals) {
            if (animal.getGender().contains(gender)){
                System.out.println(animal);

            }
        }
        System.out.print("\nSearch by age : ");
        int age = 12;
        System.out.print(12+"\n");
        System.out.println("~~~~~~~~Animal~~~~~~~~");
        for (Animal animal : animals) {
            if (animal.getAge() == age){
                System.out.println(animal);
            }
        }


        

    }
}

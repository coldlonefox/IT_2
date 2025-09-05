package Tasks.Lms.Person_lms;

public class Main {
    public static void main(String[] args) {

        //programmer
        System.out.println("\n~~~~~~~~~~PROGRAMMER~~~~~~~~~~");
        Programmer programmer = new Programmer();
        programmer.setName("Aleks");
        programmer.setDesignation("I have a programming profession.");
        programmer.setCompanyName("Ubiquity Networks");
        programmer.toString();
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();


        //dancer
        System.out.println("\n~~~~~~~~~~DANCER~~~~~~~~~~");
        Dancer dancer = new Dancer();
        dancer.setName("Dmitry");
        dancer.setDesignation("I am a dancer by profession.");
        dancer.setGroupName("(ensemble) Birch tree");
        dancer.toString();
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();

        //singer
        System.out.println("\n~~~~~~~~~~SINGER~~~~~~~~~~");
        Singer singer = new Singer();
        singer.setName("Maksim");
        singer.setDesignation("I am a singer by profession.");
        singer.setBandName("BTS");
        singer.toString();
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();

    }
}

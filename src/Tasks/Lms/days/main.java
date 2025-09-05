package Tasks.Lms.days;

import Tasks.Lms.days.enams.Days;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println(1+" "+Days.SUNDAY +" - Жекшемби");
        System.out.println(2+" "+Days.MONDAY +" - Дуйшөмбү");
        System.out.println(3+" "+Days.TUESDAY +" - Шейшемби");
        System.out.println(4+" "+Days.WEDNESDAY +" - Шаршемби");
        System.out.println(5+" "+Days.THURSDAY +" - Бейшемби");
        System.out.println(6+" "+Days.FRIDAY +" - Жума");
        System.out.println(7+" "+Days.SATURDAY +" - Ишемби");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан бериниз 1 - 7 ге чейин");
        int number = scanner.nextInt();
        switch (number){
            case 1 : System.out.println(" "+Days.SUNDAY +" Жекшемби Математика курсуна барам"); break;
            case 2 : System.out.println(" "+Days.MONDAY +" Дуйшөмбү куну жава окуйм"); break;
            case 3 : System.out.println(" "+Days.TUESDAY +" Шейшемби күнү англис тили сабагын окуйм"); break;
            case 4 : System.out.println(" "+Days.WEDNESDAY +" Шаршемби кичине фитнес кылам"); break;
            case 5 : System.out.println(" "+Days.THURSDAY +" Бейшемби жумушка барам"); break;
            case 6 : System.out.println(" "+Days.FRIDAY +" Жума кичине сейилдеп келем"); break;
            case 7 : System.out.println(" "+Days.SATURDAY +" Ишемби уйдо акме тамак жазашам"); break;

        }


    }
}

package Tasks.print.method;

public class Method2 {
    public static void main(String[] args) {
// todo   1ден 300го чейинки сандардын арасында 3ко, 4ко жана 5ке (баарына) калдыксыз
//        болунгон сандардын суммасын табыныз.
//
//todo    Логиканы void методтун жардамы менен аткарыныз
//
//
//todo    Жооп: 600 чыгат
//        for (int i = 0; i < 301; i++) {
//            if (i%3==0 && i%4==0 && i%5==0 ) {
//                System.out.println("3 "+i/3);
//            }
//        }
//        for (int i = 0; i < 301; i++) {
//            if (i%4==0) {
//                System.out.println("4 "+i/4);
//            }
//        }
//        for (int i = 0; i < 301; i++) {
//            if (i%5==0) {
//                System.out.println("5 "+i/5);
//            }
//        }
        for (int i = 0; i < 301; i++) {
            if (i%3==0 && i%4==0 && i%5==0) {
                System.out.println(i+" / 3  = "+i/3);
                System.out.println(i+" / 4  = "+i/4);
                System.out.println(i+" / 5  = "+i/5);

            }
        }
    }
}

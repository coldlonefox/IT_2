package Tasks.print.method;

import java.util.Scanner;

//public class Main {
////    public static void main(String[] args) {
////
////        public static void main(String[] args) {
////            boolean bool1 = true, bool2 = false;
////            boolean bool;
////            int san1=0,san2=0,san3=0,booln = 0,jop = 0;
////            int nsan1 = 0,nsan2 = 0,nsan3 = 0,tak = 1, jup = 0;
////            String[] takJupOut = new String[4];takJupOut[0]="Жуп";takJupOut[1]="Так";takJupOut[2]="кичине";takJupOut[3]="чон";
////            String worldTakJup ="";
////            do { bool = bool2;
////                System.out.println("   Сиз 1 ден 3 ко чейин бере алас! Канча сан берес?");
////                int X = new Scanner(System.in).nextInt();
////                switch (X){
////                    case 1 : {
////                        System.out.println("\n сиз кайсы санга калдыксыз кобойтос ошол санды берес");
////                        System.out.print("1 сан бериниз: ");
////                        int rsan1 = new Scanner(System.in).nextInt();
////                        san1 = rsan1;booln++;
////                        bool = bool2; break;
////                    }
////                    case 2 : {
////                        System.out.println("\n сиз кайсы санга калдыксыз кобойтос ошол санды берес");
////                        System.out.print("1 сан бериниз: ");
////                        int rsan1 = new Scanner(System.in).nextInt();
////                        san1 = rsan1;booln++;
////                        System.out.print("2 сан бериниз: ");
////                        int rsan2 = new Scanner(System.in).nextInt();
////                        san2 = rsan2;booln++;
////                        bool = bool2;break;
////                    }
////                    case 3 : {
////                        System.out.println("\n сиз кайсы санга калдыксыз кобойтос ошол санды берес");
////                        System.out.print("1 сан бериниз: ");
////                        int rsan1 = new Scanner(System.in).nextInt();
////                        san1 = rsan1;booln++;
////                        System.out.print("2 сан бериниз: ");
////                        int rsan2 = new Scanner(System.in).nextInt();
////                        san2 = rsan2;booln++;
////                        System.out.print("3 сан бериниз: ");
////                        int rsan3 = new Scanner(System.in).nextInt();
////                        san3 = rsan3;booln++;
////                        bool = bool2;break;
////                    } default:{
////                        System.out.println("Сиз 1 ден 3 ко чейин San бере алас!");
////                        System.out.println("Улантасызбы? ");
////                        Scanner scanner = new Scanner(System.in);
////                        String WorldS = scanner.nextLine();
////                        if (WorldS.equals("yes")||WorldS.equals("oba")||WorldS.equals("да")||WorldS.equals("оба")) {
////                            bool = bool1;
////                        } else if (WorldS.equals("no")||WorldS.equals("jok")||WorldS.equals("нет")||WorldS.equals("жок")) {
////                            jop +=10;
////                            bool = bool2;break;
////                        }
////                    }
////                }
////            }while (bool);
////            System.out.println(booln+" Жолу жазыныз.");
////            for (int i = 0; i < booln; i++) {
////                System.out.println("Кандай сан чыгарас 'так' же 'жуп'?");
////                String takJup = new Scanner(System.in).nextLine();
////                if (takJup.equals("так")|| takJup.equals("tak")||takJup.equals("tak san")||takJup.equals("так сан")) {
////                    System.out.println("Сураныч канчанчы санды так кылас");
////                    System.out.println("№1: "+san1+" №2: "+san2+" №3: "+san3+"  Сиз бир гана '1' '2' '3' деп жасаныз болот!");
////                    int san = new Scanner(System.in).nextInt();
////                    worldTakJup = takJupOut[1];
////                    switch (san){
////                        case 1 : {
////                            nsan1 = tak;
////                            break;
////                        }
////                        case 2 : {
////                            nsan2 = tak;
////                            break;
////                        }
////                        case 3 : {
////                            nsan3 = tak;
////                            break;
////                        }
////                        default:{
////                            System.out.println("Мындай сан жок! "+san);
////                            System.out.println("Чыгаспы же улантаспы?");
////                            Scanner scanner = new Scanner(System.in);
////                            String worldF = scanner.nextLine();
////                            if (worldF.equals("true") || worldF.equals("yes") || worldF.equals("да")||worldF.equals("oba")||worldF.equals("оба")){
////                                break;
////                            } else if (worldF.equals("false") || worldF.equals("no") || worldF.equals("нет")||worldF.equals("jok")||worldF.equals("жок")) {
////
////                            } else {
////                                System.out.println("Сиз 'оба' анан 'жок' деп кана жооп бере алас!");
////                                scanner.next();
////                            }
////                        }
////                    }
////                } else if (takJup.equals("жуп")|| takJup.equals("jup")||takJup.equals("jup san")||takJup.equals("жуп сан")){
////                    System.out.println("Сураныч канчанчы санды жуп кылас");
////                    System.out.println("№1: "+san1+" №2: "+san2+" №3: "+san3+"  Сиз бир гана '1' '2' '3' деп жасаныз болот!");
////                    int san = new Scanner(System.in).nextInt();
////                    worldTakJup = takJupOut[0];
////                    switch (san){
////                        case 1 : {
////                            nsan1 = jup;
////                            break;
////                        }
////                        case 2 : {
////                            nsan2 = jup;
////                            break;
////                        }
////                        case 3 : {
////                            nsan3 = jup;
////                            break;
////                        }
////                        default:{
////                            System.out.println("Мындай сан жок! "+san);
////                            System.out.println("Чыгаспы же улантаспы?");
////                            Scanner scanner = new Scanner(System.in);
////                            String worldF = scanner.nextLine();
////                            if (worldF.equals("true") || worldF.equals("yes") || worldF.equals("да")||worldF.equals("oba")||worldF.equals("оба")){
////                                break;
////                            } else if (worldF.equals("false") || worldF.equals("no") || worldF.equals("нет")||worldF.equals("jok")||worldF.equals("жок")) {
////
////                            } else {
////                                System.out.println("Мындай сан жок! "+san);
////                                System.out.println("Чыгаспы же улантаспы? Сиз 'оба' анан 'жок' деп кана жооп бере алас!");
////                                String worldG = scanner.nextLine();
////                                if (worldG.equals("true") || worldG.equals("yes") || worldG.equals("да")||worldG.equals("oba")||worldG.equals("оба")){
////                                    break;
////                                } else if (worldG.equals("false") || worldG.equals("no") || worldG.equals("нет")||worldG.equals("jok")||worldG.equals("жок")) {
////
////                                } else {
////                                    System.out.println("Сиз 'оба' анан 'жок' деп кана жооп бере алас!");
////                                    scanner.next();
////                                }
////
////                            }
////                        }
////                    }
////                }
////            }
////            int num = 0;
////            if (jop < 10) {
////                do {bool = bool1;
////                    System.out.printf("Эн %s сан бериниз! : ",takJupOut[3]);
////                    Scanner scanner =new Scanner(System.in);
////                    int number = scanner.nextInt();
////
////                    if (number > 0) {
////                        num += number;
////                        break;
////                    }else {
////                        System.out.println("Сиз минуз сан бердиниз! Он сан болуш керек.");
////                    }
////                }while (bool);
////            }else {
////                System.out.println("Конул бурганынызка чон рахмат.");
////            }
////            myWorld(num, san1, san2, san3, nsan1, nsan2, nsan3,booln,worldTakJup);
////        }
////        public void myWorlxd (int array,int san1,int san2,int san3,int nsan1, int nsan2,int nsan3,int booln, String worldOut){
////            int summa = 0, summa1 = 0,summa2 = 0, summa3 = 0, art = 0,art1 = 0,art2 = 0,art3 = 0, oSan = 0;
////            System.out.printf("\n   %d ко %d ко %d ке болуно турган %s сандар!",san1,san2,san3);
////            System.out.print("\nsandar: ");
////            for (int i = 0; i < array; i++) {
////                switch (booln){
////                    case 1 : {
////                        if (i%san1 == nsan1) {
////                            summa1 +=i; art1 +=i;
////                            summa = summa1; art = art1;
////                            System.out.print(i+", ");
////                        }
////                        if (i < array/2) { oSan++; }
////                        break;
////                    }
////                    case 2 : {
////                        if (i%san1 == nsan1 && i%san2 == nsan2) {
////                            summa2 +=i; art2 +=i;
////                            summa = summa2; art = art2;
////                            System.out.print(i+", ");
////                        }
////                        if (i < array/2) { oSan++; }
////                        break;
////                    }
////                    case 3 : {
////                        if (i%san1 == nsan1 && i%san2 == nsan2 && i%san3 == nsan3) {
////                            summa3 +=i; art3 +=i;
////                            summa = summa3; art = art3;
////                            System.out.print(i+", ");
////                        }
////                        if (i < array/2) { oSan++; }
////                        break;
////                    }
////                }
////            }
////            System.out.println("\n\nСумма: "+summa);
////            System.out.println("Сумманын орточо арфметикалык саны: "+art/2);
////            System.out.println("Орточо арифметикалык саны: "+oSan);
////        }
////    }
//}

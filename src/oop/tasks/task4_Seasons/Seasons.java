package oop.tasks.task4_Seasons;

public class Seasons {
    String winter = "зима";
    String spring = "весна";
    String summer = "лето";
    String autumn = "осень";
    String[] months = {"Яньварь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
    public void object (int number){
        switch (number){
            case 1 : {System.out.println("~~~~~~~~~~"+months[0]+"~~~~~~~~~~\n"+"      ===> "+winter+" <===");break;}
            case 2 : {System.out.println("~~~~~~~~~~"+months[1]+"~~~~~~~~~~\n"+"      ===> "+winter+" <===");break;}
            case 3 : {System.out.println("~~~~~~~~~~"+months[2]+"~~~~~~~~~~\n"+"      ===> "+spring+" <===");break;}
            case 4 : {System.out.println("~~~~~~~~~~"+months[3]+"~~~~~~~~~~\n"+"      ===> "+spring+" <===");break;}
            case 5 : {System.out.println("~~~~~~~~~~"+months[4]+"~~~~~~~~~~\n"+"      ===> "+spring+" <===");break;}
            case 6 : {System.out.println("~~~~~~~~~~"+months[5]+"~~~~~~~~~~\n"+"      ===> "+summer+" <===");break;}
            case 7 : {System.out.println("~~~~~~~~~~"+months[6]+"~~~~~~~~~~\n"+"      ===> "+summer+" <===");break;}
            case 8 : {System.out.println("~~~~~~~~~~"+months[7]+"~~~~~~~~~~\n"+"      ===> "+summer+" <===");break;}
            case 9 : {System.out.println("~~~~~~~~~~"+months[8]+"~~~~~~~~~~\n"+"      ===> "+autumn+" <===");break;}
            case 10 : {System.out.println("~~~~~~~~~~"+months[9]+"~~~~~~~~~~\n"+"      ===> "+autumn+" <===");break;}
            case 11 : {System.out.println("~~~~~~~~~~"+months[10]+"~~~~~~~~~~\n"+"      ===> "+autumn+" <===");break;}
            case 12 : {System.out.println("~~~~~~~~~~"+months[11]+"~~~~~~~~~~\n"+"      ===> "+winter+" <===");break;}
            default: {System.out.println("Мындай ай жок! :"+number);break;}
        }
    }
}

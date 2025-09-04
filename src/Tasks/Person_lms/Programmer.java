package Tasks.Person_lms;

public class Programmer extends Person{
    private String companyName;
    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return  " "+super.toString() + '\n' +
                "Company name: " + companyName + '\n';
    }

    @Override
    public void learn() {
        System.out.println("I teach kids coding.");
    }

    @Override
    public void walk() {
        System.out.println("i am going to work .");
    }

    @Override
    public void eat() {
        System.out.println("I rarely eat these cookies, but I love my mom's cookies, they are very tasty, my family, I love them all .");
    }

    public void coding(){
        System.out.println("I am a programmer, I have a question \"why did I choose this profession?\" the answer is only inside and how to find it. I know why I chose this profession! .");
    }
}

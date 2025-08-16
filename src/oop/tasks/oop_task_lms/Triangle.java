package oop.tasks.oop_task_lms;

public class Triangle {
    long a;
    long b;
    long c;

    public void area(long a, long b, long c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    @Override
    public String toString() {
        return  "a = " + a + "\n"+
                "b = " + b + "\n"+
                "c = " + c + "\n"+
                "(a + b + c)/2 = "+(a+b+c)/2+"\n"+
                "Аянты: "+(a+b+c)/2;
    }
}

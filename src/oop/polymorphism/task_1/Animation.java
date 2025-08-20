package oop.polymorphism.task_1;

public record Animation(long id) {
    public static void main(String[] args) {

    }
    public static class Animal {
        private String name;
        private  int age;

        public Animal() {
        }

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static class Cat extends  Animal {


            public Cat() {
            }

            public Cat(String name, int age) {
                super(name, age);
            }

        }
        public static class Dog extends Animal {

            public Dog() {
            }

            public Dog(String name, int age) {
                super(name, age);
            }
        }
        public static class Sheep extends Animal {

            public Sheep() {
            }

            public Sheep(String name, int age) {
                super(name, age);
            }
        }
    }
}

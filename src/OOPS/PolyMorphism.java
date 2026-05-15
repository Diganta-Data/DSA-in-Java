package OOPS;

public class PolyMorphism {
    public static class dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Dog {
        void speak() {
            System.out.println("Bhau Bhau");
        }
    }
        public static class Cat {
            void speak() {
                System.out.println("Meow Meow");
            }
        }
            public static class Pikachu {
                void speak() {
                    System.out.println("pika pika");
                }
            }
                public static class Human {
                    void speak() {
                        System.out.println("hello");
                    }
                }
    public static void main(String[] args){
        Human h =new Human();
        Pikachu p = new Pikachu();
        Cat c = new Cat();
        Dog d = new Dog();

        h.speak();
        p.speak();
        c.speak();
        d.speak();
    }
}

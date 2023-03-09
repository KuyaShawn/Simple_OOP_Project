public class Main {
    public static void main(String[] args) {
        Dog Dog = new Dog();
        Cat Cat = new Cat();
        Hamster Hamster = new Hamster();
        Snake Snake = new Snake();
        Bird Bird = new Bird();

        Dog.setSize("Giant");
        Cat.setSize("Medium");
        Hamster.setSize("Tiny");
        Bird.setSize("Small");
        Snake.setSize("Big");


        System.out.println("Dog size: " +Dog.getSize());
        System.out.println("Cat size: " +Cat.getSize());
        System.out.println("Hamster size: " +Hamster.getSize());
        System.out.println("Bird size: " +Bird.getSize());
        System.out.println("Snake size: " +Snake.getSize());

        System.out.println();
        System.out.println();

        // Polymorphism
        Pug pug = new Pug();
        pug.breathe();
        pug.speak();
        pug.bark();
    }
}
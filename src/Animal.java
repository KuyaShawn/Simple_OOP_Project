// Abstraction Pillar
abstract class Animal {
    public void run(){
        System.out.println("Animal is running");
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void nap(){
        System.out.println("Animal is sleeping");
    }

    public void swim(){
        System.out.println("Animal is swimming");
    }

    //abstract methods declaration
    abstract void hunts();
    //abstract methods declaration
    abstract void commonPet();
    //abstract methods declaration
    abstract void speak();

}

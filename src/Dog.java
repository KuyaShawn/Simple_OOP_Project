// Encapsulation Pillar
// Inheritance Pillar
public class Dog extends Animal {

    //Encapsulation using private modifier
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Polymorphism
    @Override
    void hunts() {
        System.out.println("Does both hunt");
    }


    // Polymorphism
    @Override
    void commonPet() {
        System.out.println("Dog is a common pet");
    }

    // Polymorphism
    @Override
    void speak() {
        System.out.println("Bark");
    }

    void breathe(){
        System.out.println("normal breathing");
    }
}

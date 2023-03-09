// Encapsulation Pillar
// Inheritance Pillar
public class Snake extends Animal {

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
        System.out.println("Does hunt");
    }

    // Polymorphism
    @Override
    void commonPet() {
        System.out.println("Snake is not a common pet");
    }

    //Polymorphism
    @Override
    void speak() {
        System.out.println("Hiss");
    }
}

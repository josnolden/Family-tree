import java.util.Arrays;

public class FamilyTree {
    public static void main(String[] args) {
        Person Jan = new Person("Jan", "Ree", 30, "M");
        Pet Flappie = new Pet("Flappie", 10, "Dog");
        Jan.addPet(Flappie);
    }
}

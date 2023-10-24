import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PetTest {

    //arrange:
    Pet testPet = new Pet("Testpet", 0, "Testhond");
    Person testOwner = new Person("Eigenaar", "van de", "Testhond", 13, "M");


    @Test
    void setOwner() {
        //act:
        testPet.setOwner(testOwner);

        //assert:
        assertTrue(testOwner.getPets().contains(testPet));
    }

    //assert:
    @Test
    void getName() {
        //assert:
        assertEquals("TestPet", testPet.getName());
    }

    @Test
    void getAge() {
        //assert:
        assertEquals(0, testPet.getAge());
    }

    @Test
    void getSpecies() {
        //assert:
        assertEquals("Testhond", testPet.getSpecies());
    }

    @Test
    void getOwner() {
        //assert:
        assertEquals(testOwner, testPet.getOwner());
    }

    @Test
    void setName() {
        //act:
        testPet.setName("Dinges");

        //assert:
        assertEquals("Dinges", testPet.getName());
    }

    @Test
    void setAge() {
        //act:
        testPet.setAge(1);

        //assert:
        assertEquals(1, testPet.getAge());
    }

    @Test
    void setSpecies() {
        //act:
        testPet.setName("TestKat");

        //assert:
        assertEquals("TestKat", testPet.getSpecies());
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    //arrange
    Person testOpa = new Person("Opa", "Test", 80, "M");
    Person testOma = new Person("Oma", "Test", 75, "F");
    Person testPappa = new Person("Pappa", "Test", 40, "M");
    Person testMamma = new Person("Pamma", "van", "Toost", 38, "F");
    Person testBroer = new Person("Broer", "Test", 10, "M");
    Person testZus = new Person("Zus", "Test", 7, "F");
    Pet testPet = new Pet("testKat", 5, "Kat");
    Person testOom = new Person("Oom", "Test", 35, "M");
    Person testNeef = new Person("Neef", "Test", 12, "M");

    @Test
    void addParents() {
        //act
        testBroer.addParents(testMamma, testPappa);

        //assert
        assertTrue(testMamma.getChildren().contains(testBroer));
        assertTrue(testPappa.getChildren().contains(testBroer));
    }

    @Test
    void addChild() {
        //act
        testPappa.addChild(testZus);

        //assert
        assertTrue(testPappa.getChildren().contains(testZus));
    }

    @Test
    void addPet() {
        //act
        testBroer.addPet(testPet);

        //assert
        assertTrue(testBroer.getPets().contains(testPet));
    }

    @Test
    void addSibling() {
        //act
        testBroer.addSibling(testZus);

        //assert
        assertTrue(testBroer.getSiblings().contains(testZus));
        assertTrue(testZus.getSiblings().contains(testBroer));

    }

    @Test
    void getName() {
        //assert
        assertEquals("Opa", testOpa.getName());
    }

    @Test
    void getMiddleName() {
        //assert
        assertEquals("van", testMamma.getMiddleName());
    }

    @Test
    void getLastName() {
        //assert
        assertEquals("Test", testOma.getMiddleName());
    }

    @Test
    void getSex() {
        //assert
        assertEquals("F", testMamma.getSex());
    }

    @Test
    void getAge() {
        //assert
        assertEquals(10, testBroer.getAge());
    }

    @Test
    void getMother() {
        //assert
        assertEquals(testMamma, testBroer.getMother());
    }

    @Test
    void getFather() {
        //assert
        assertEquals(testPappa, testBroer.getFather());
    }

    @Test
    void getSiblings() {
        //assert
        assertTrue(testBroer.getSiblings().contains(testZus));
    }

    @Test
    void getChildren() {
        //assert
        assertTrue(testPappa.getChildren().contains(testBroer));
    }

    @Test
    void getPets() {
        //assert
        assertTrue(testBroer.getPets().contains(testPet));
    }

    @Test
    void setName() {
        //act
        testZus.setName("Zusje");

        //assert
        assertEquals("Zusje", testZus.getName());
    }

    @Test
    void setMiddleName() {
        //act
        testMamma.setMiddleName("de");

        //assert
        assertEquals("de", testMamma.getMiddleName());
    }

    @Test
    void setLastName() {
        //act
        testMamma.setLastName("Toast");

        //assert
        assertEquals("Toast", testMamma.getLastName());
    }

    @Test
    void setSex() {
        //doen we niet aan
    }

    @Test
    void setAge() {
        //act
        testOpa.setAge(81);

        //assert
        assertEquals(81, testOpa.getAge());
    }

    @Test
    void getGrandChildren() {
        //assert
        assertTrue(testOpa.getGrandChildren().contains(testBroer));
    }

    @Test
    void getGrandChildrensPets() {
        //assert
        assertTrue(testOpa.getGrandChildrensPets().contains(testPet));
    }

    @Test
    void getNephews() {
        //act
        testPappa.addSibling(testOom);
        testOom.addChild(testNeef);

        //assert
        assertTrue(testPappa.getNephews().contains(testNeef));
    }
}
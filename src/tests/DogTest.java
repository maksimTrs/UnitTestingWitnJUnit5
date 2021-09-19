package tests;

import com.company.Dog;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

     static Dog dog;

    @BeforeAll
    static void startMethod() {
        System.out.println("Tests have started");
        dog = new Dog("Dog1", 1);
    }

    @AfterAll
    static void finishMethod() {
        System.out.println("Tests were finished");
    }


    @Test
    void getNameTest() {
        assertEquals("Dog1", dog.getName(), "The Values are not equals!");
    }

    @Test
    void getAge() {
    }

    @Test
    void setNameTest() {
        dog.setName("Dog1.1");
        assertNotEquals("Dog1.1", dog.getName(), "Dog name has incorrect value!");
    }

    @Test
    void setNameTest2() {
        Dog dog1 = new Dog("",  1);
        dog1.setName("Dog1");
        assertEquals("Dog1", dog1.getName(), "Dog name has incorrect value!");
    }

    @Test
    void setAge() {
    }
}
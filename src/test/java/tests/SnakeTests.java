package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;

    @BeforeAll
    public static void createAnimals() {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
    }

    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak pss Tests")
    public void snakeGoesPssTest() {
        assertEquals("The snake goes pss! pss!", actualSnake.speak(), "I was expecting pss");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Scales is it Hyperallergetic")
    public void snakeHyperAllergeticTests() {
        assertEquals("The snake is hyperallergetic!", actualSnake.snakeHypoallergenic(),
                "The snake is hyperallergetic!");
    }
    @Test
    @Order(1)
    @DisplayName("Snake has NO legs Test")
    public void legTests() {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Female")
    public void genderTestFemale() {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualSnake.getGender(), "Expecting Female Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test MILK")
    public void genderSnakeBreed() {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.FEMALE, Breed.MILK);
        assertEquals(Breed.MILK, actualSnake.getBreed(), "Expecting Breed Milk!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Hiss Tests")
    public void snakeGoesHissTest() {
        actualSnake = new Snake(AnimalType.WILD, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes hiss! hiss!", actualSnake.speak(), "I was expecting hiss");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Pss Tests")
    public void snakeGoesPsssTest() {
        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes Psss! Psss!", actualSnake.speak(), "I was expecting Psss");
    }
}

package ec.edu.epn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    // suma
    @Test
    void addTwoPositiveNumbersReturnsCorrectSum() {
        //Arrange

        int a = 3;
        int b = 4;

        //Act

        int result = calculator.add(a, b);

        //Assert

        assertEquals(7, result);
    }

    // resta
    @Test
    void subtractTwoNumbersReturnsCorrectDifference() {
        //Arrange
        int a = 10;
        int b = 4;

        //Act
        int result = calculator.subtract(a, b);

        //Assert
        assertEquals(6, result);
    }

    // multiplicación
    @Test
    void multiplyTwoNumbersReturnsCorrectProduct() {
        //Arrange
        int a = 6;
        int b = 7;

        //Act
        int result = calculator.multiply(a, b);

        //Assert
        assertEquals(42, result);
    }

    // división
    @Test
    void divideTwoNumbersReturnsCorrectQuotient() {
        //Arrange
        int a = 7;
        int b = 2;

        //Act
        double result = calculator.divide(a, b);

        //Assert
        assertEquals(3.5, result, 1e-9);
    }

    @Test
    void divideByZeroThrowsIllegalArgumentException() {
        //Arrange
        int a = 5;
        int b = 0;

        //Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }

    // isEven
    @Test
    void isEvenReturnsTrueForEvenNumber() {
        assertTrue(calculator.isEven(8));
    }

    @Test
    void isEvenReturnsFalseForOddNumber() {
        assertFalse(calculator.isEven(7));
    }
}



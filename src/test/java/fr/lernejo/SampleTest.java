package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {


    @Test
    void multiplication() {
        int a = 3;
        int b = 6;
        int expected = 18;
        Sample.Operation operation = Sample.Operation.MULT;
        Sample sample = new Sample();
        Assertions.assertEquals(expected, sample.op(operation,a,b));
    }
    @Test
    void multiplicationNeg() {
        int a = 3;
        int b = 6;
        int expected = 9;
        Sample.Operation operation = Sample.Operation.MULT;
        Sample sample = new Sample();
        Assertions.assertNotEquals(expected, sample.op(operation,a,b));
    }

    @Test
    void addition() {
        int a = 3;
        int b = 6;
        int expected = 9;
        Sample.Operation operation = Sample.Operation.ADD;
        Sample sample = new Sample();
        Assertions.assertEquals(expected, sample.op(operation,a,b));
    }

    @Test
    void additionNeg() {
        int a = 3;
        int b = 6;
        int expected = 18;
        Sample.Operation operation = Sample.Operation.ADD;
        Sample sample = new Sample();
        Assertions.assertNotEquals(expected, sample.op(operation,a,b));
    }

    @Test
    void enumeration()
    {
        Sample.Operation operation = Sample.Operation.MULT;
        Assertions.assertEquals(operation, Sample.Operation.MULT);
    }

    @Test
    void enumerationNeg()
    {
        Sample.Operation operation = Sample.Operation.MULT;
        Assertions.assertNotEquals(operation, Sample.Operation.ADD);
    }

    @Test
    void Operation() {
        Sample test = new Sample();
        Assertions.assertNotNull(test);
    }

    @Test
    void OperationNeg() {
        Sample test = null;
        Assertions.assertNull(test);
    }


}

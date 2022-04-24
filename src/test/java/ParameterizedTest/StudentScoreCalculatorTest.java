package ParameterizedTest;

import Parameterized.StudentScoreCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentScoreCalculatorTest {
    StudentScoreCalculator sc;
    @BeforeEach
    public void setup(){
       sc = new StudentScoreCalculator();
    }
    @Test
    public void studentScoreCalculatorRegular(){

        sc.calculateSATScore(50,50);

        assertEquals(2500,sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorMathsNegative(){
        sc.calculateSATScore(-1, 50);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorLiteracyNegative(){
        sc.calculateSATScore(50, -1);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorBothNegative(){
        sc.calculateSATScore(-1, -1);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorMathsHigh(){
        sc.calculateSATScore(102, 50);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorLiteracyHigh(){
        sc.calculateSATScore(50, 150);
        assertEquals(-1, sc.getSatScore());

    }

    @Test
    public void studentScoreCalculatorBothHigh(){
        sc.calculateSATScore(150, 150);
        assertEquals(-1, sc.getSatScore());

    }


}

//Parameterized Testing - Multiple Tests with similar layout and small parameter differences


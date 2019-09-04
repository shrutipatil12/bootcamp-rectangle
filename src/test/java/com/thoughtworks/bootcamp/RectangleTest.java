package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {

//    @BeforeEach(){
//
//    }
    @Test
    public void givenZeroLengthAndBreadth_whenCalculateArea_ThenshouldReturnZero(){
            float length = 0.0f;
            Rectangle rect = new Rectangle(length);
            Assertions.assertEquals(0,rect.CalculateArea());
    }
    @Test
    public void givenLengthAndBreadthOne_whenCalculateArea_ThenshouldReturn(){
        float length = 0.0f;
        Rectangle rect = new Rectangle(length);
        Assertions.assertEquals(0.0f,rect.CalculateArea());
    }
    @Test
    public void givenLengthAndBreadthTwo_whenCalculateArea_ThenshouldReturnFour(){
        float length = 2.0f;
        Rectangle rect = new Rectangle(length);
        Assertions.assertEquals(4.0f,rect.CalculateArea());
    }

    @Test
    public void givenLengthFiveAndBreadthEight_whenCalculateArea_ThenshouldReturnFourty(){
        float length = 2.0f;
        Rectangle rect = new Rectangle(length);
        Assertions.assertEquals(4.0f,rect.CalculateArea());
    }
}

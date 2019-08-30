package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void givenZeroLengthAndBreadth_whenCalculateAreaOfRectangle_ThenshouldReturnZero(){
            float length = 0.0f;
            float breadth = 0.0f;
            Rectangle rect = new Rectangle();
            Assertions.assertEquals(0,rect.CalculateAreaOfRectangle(length,breadth));
    }
}

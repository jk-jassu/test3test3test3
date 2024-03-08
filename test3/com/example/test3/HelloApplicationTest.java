package com.example.test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloApplicationTest {

    @Test
    void  minesalary() {
        HelloApplication X= new HelloApplication();
        assertEquals(X.minesalary(3000), 36000);
    }
}
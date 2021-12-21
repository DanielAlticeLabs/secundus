package com.poc.poc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CalculatorTests {

        @Test  
        void contextLoads() {
                assert (Calculator.operation(0, 1, 2) == 3);
                assert (Calculator.operation(0, 1, 2) != 4);
        }

}
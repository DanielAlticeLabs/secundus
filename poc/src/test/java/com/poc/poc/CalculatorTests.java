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
        // Success
        assert(Calculator.operation(1, 2) == 3);

        //Fail
        assert(Calculator.operation(1, 2) == 4);
	}

}
package com.fjlhome.cpdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CpDemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void name() {
	}

	//generate a test that checks the mathUtils add method returns the addition of two input numbers
	@Test
	void shouldPassIfAdditionMatches() {
		MathUtils mathUtils = new MathUtils();
		double expected = 2;
		double actual = mathUtils.add(1, 1);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	void shouldPassIfSubtractionMatches() {
		MathUtils mathUtils = new MathUtils();
		double expected = 0;
		double actual = mathUtils.subtract(1, 1);
		assertThat(actual).isEqualTo(expected);
	}

}

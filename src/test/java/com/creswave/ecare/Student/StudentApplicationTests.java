package com.creswave.ecare.Student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class StudentApplicationTests {
	Calculator undertest = new Calculator();
	@Test
	void itShouldAddNumbers() {
		// given
		int numberOne =20;
		int numberTwo =30;
		//when
		int results = undertest.add(numberOne, numberTwo);

		//then
		assertThat(results).isEqualTo(50);
	}
	class Calculator{
		int add(int a, int b){
			return a+b;
		}
	}
}

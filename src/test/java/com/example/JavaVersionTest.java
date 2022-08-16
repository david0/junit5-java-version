package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


class JavaVersionTest {


	@Test
	void testUsesJava8() {
		assertThat(System.getProperty("java.version")).startsWith("1.8");
	}
}

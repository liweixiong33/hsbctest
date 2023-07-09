package com.lwx.test;

import com.lwx.test.arithmetic.ConsecutiveRemover;
import com.lwx.test.arithmetic.ConsecutiveReplace;
import com.lwx.test.config.StringProcessor;
import com.lwx.test.config.StringProcessorRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testFilterString_noConsecutiveChars() {
		String input = "abcde";
		StringProcessor processor = new ConsecutiveRemover();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals(input, filtered);
	}

	@Test
	public void testFilterString_removeConsecutiveChars() {
		String input = "aabcccbbad";
		StringProcessor processor = new ConsecutiveRemover();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("d", filtered);
	}

	@Test
	public void testFilterString_onlyConsecutiveChars() {
		String input = "aaa";
		StringProcessor processor = new ConsecutiveRemover();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("", filtered);
	}

	@Test
	public void testFilterString_emptyString() {
		String input = "";
		StringProcessor processor = new ConsecutiveRemover();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("", filtered);
	}

	//------------------------------------------------------------------------------

	@Test
	public void testFilterString_replaceNoConsecutiveChars() {
		String input = "abcde";
		StringProcessor processor = new ConsecutiveReplace();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals(input, filtered);
	}

	@Test
	public void testFilterString_replaceConsecutiveChars() {
		String input = "abcccbad";
		StringProcessor processor = new ConsecutiveReplace();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("d", filtered);
	}

	@Test
	public void testFilterString_replaceOnlyConsecutiveChars() {
		String input = "aaa";
		StringProcessor processor = new ConsecutiveReplace();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("", filtered);
	}

	@Test
	public void testFilterString_replaceEmptyString() {
		String input = "";
		StringProcessor processor = new ConsecutiveReplace();
		String filtered = StringProcessorRunner.run(input, processor);
		Assertions.assertEquals("", filtered);
	}
}

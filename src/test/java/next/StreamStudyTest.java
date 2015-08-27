package next;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import next.StreamStudy;

import org.junit.Before;
import org.junit.Test;

public class StreamStudyTest {
	private List<Integer> numbers;
	
	@Before
	public void setup() {
		numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	}
	
	@Test
	public void countWords() throws Exception {
		String fileName = "src\\main\\resources\\war-and-peace.txt";
		long result = StreamStudy.countWords(fileName);
		System.out.println("result : " + result);
	}
	
	@Test
	public void map() throws Exception {
		List<Integer> doubleNumbers = StreamStudy.doubleNumbers(numbers);
		doubleNumbers.forEach(System.out::println);
	}
	
	@Test
	public void sumAll() throws Exception {
		long sum = StreamStudy.sumAll(numbers);
		assertEquals(21, sum);
	}
	
	@Test
	public void sumOverThreeAndDouble() throws Exception {
		numbers = Arrays.asList(3, 1, 6, 2, 4, 8);
		long sum = StreamStudy.sumOverThreeAndDouble(numbers);
		assertEquals(36, sum);
	}
}

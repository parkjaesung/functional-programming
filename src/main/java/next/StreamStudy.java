package next;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {

	public static long countWords(String fileName) throws IOException {
		String contents = new String(Files.readAllBytes(Paths
				.get(fileName)), StandardCharsets.UTF_8);
		List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

		long count = 0;
		for (String w : words) {
		  if (w.length() > 12) count++;  
		}
		return count;
	}

	public static List<Integer> doubleNumbers(List<Integer> numbers) {
		return numbers.stream().map(x -> 2 * x).collect(Collectors.toList());
	}

	public static long sumAll(List<Integer> numbers) {
		return numbers.stream().reduce(0, (x, y) -> x + y);
	}

	public static long sumOverThreeAndDouble(List<Integer> numbers) {
		return 0;
	}

}

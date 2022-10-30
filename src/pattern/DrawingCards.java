package pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrawingCards {
    public static List<Integer> listOfNumbers(Person[] arr){
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                numbers.add(i);
            }
        Collections.shuffle(numbers);
        return numbers;
    }
}

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverageWhenListEmpty() {

        //Given
        int[] emptyList = new int[0];

        //When

        double result = ArrayOperations.getAverage(emptyList);

        //Then
        assertEquals(0.0, result);

    }

        @Test
        void testGetAverageWhenListIsFull() {

        //Given
            int fullList[] = {2, 4, 6, 5, 4, 2, 4, 2, 4, 5};

            //When
            double result = ArrayOperations.getAverage(fullList);

            //Then
            assertEquals(3.8, result);

        }

        }







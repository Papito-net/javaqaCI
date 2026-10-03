import org.junit.jupiter.api.Assertions;
//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;


public class StatisticsServiceTest {

    @Test
    public void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 5, 6, 3, 8, 6, 11, 11, 15};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}


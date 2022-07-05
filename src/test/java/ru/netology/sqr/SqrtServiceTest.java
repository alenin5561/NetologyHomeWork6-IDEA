package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/data.csv")
    public void shouldCalcExact(int expected, int x, int y) {
        SQRService service = new SQRService();

        //int expected = 13;
        int actual = service.calcSqrt(x, y);
        Assertions.assertEquals(expected, actual);
    }
}

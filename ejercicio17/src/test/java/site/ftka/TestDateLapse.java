package site.ftka;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestDateLapse {

    @Test
    void test() {
        DateLapse lapso = new DateLapse(LocalDate.of(2023, 1, 1), 31);
        assert lapso.sizeInDays() == 31;
        assert lapso.includesDate(LocalDate.of(2023, 1, 1));
        assert lapso.includesDate(LocalDate.of(2023, 1, 15));
        assert lapso.includesDate(LocalDate.of(2023, 1, 31));
        assert !lapso.includesDate(LocalDate.of(2022, 12, 31));
        assert !lapso.includesDate(LocalDate.of(2023, 2, 1));
        assert !lapso.includesDate(null);
    }

}
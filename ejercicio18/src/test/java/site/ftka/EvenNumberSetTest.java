package site.ftka;

import org.junit.jupiter.api.Test;

import java.util.Set;

public class EvenNumberSetTest {

    @Test
    void test() {
        Set<Integer> set = new EvenNumberSet<>();

        for (int i = 0; i <= 100; i++) {
            set.add(i);
        }

        assert set.size() == 51;
        assert set.contains(0);
        assert set.contains(2);
        assert set.contains(50);
        assert set.contains(100);
        assert !set.contains(1);
        assert !set.contains(99);
        assert !set.contains(101);
    }

}

package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Num() {
        int[] data = new int[] {9, 8, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5Num() {
        int[] data = new int[] {20, 40, 10, 50, 30};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 40, 50};
        assertThat(result).containsExactly(expected);
    }
}
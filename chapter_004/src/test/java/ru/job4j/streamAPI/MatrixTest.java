package ru.job4j.streamAPI;


import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void convertInStrem() {
        Integer[][] array = new Integer[2][2];
        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        var result = Matrix.convertInStrem(array);
        var extend = new ArrayList<Integer>();
        extend.add(1);
        extend.add(2);
        extend.add(3);
        extend.add(4);
        assertThat(result, is(extend));
    }
}

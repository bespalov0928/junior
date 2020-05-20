package ru.job4j.tracker;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class ValidateInputTest {


    @Test
    public void whenInvalidInput() {
        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        PrintStream out = System.out;
        System.setOut(new PrintStream(mem));
        //String[] data = {"one", "1"};
        ValidateInput input = new ValidateInput(new StubInput(Arrays.asList(new String[]{"one", "1"})));
        input.askInt("Enter");
        assertThat(mem.toString(), is(String.format("Please enter validate data again.%n")));
        System.setOut(out);
    }
}

package pl.stacjait;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FactorTest {

    @Test
    public void shouldExtractNumber() {
        FactorExtractor fe = new FactorExtractor();
        assertTrue(fe.extract(1).isEmpty());
        assertTrue(fe.extract(2).equals(Arrays.asList(2)));
        assertEquals(fe.extract(4),(Arrays.asList(2,2)));
        assertTrue(fe.extract(6).equals(Arrays.asList(2,3)));


    }


}

package com.williampowell.chitter;

import static org.junit.Assert.*;
import org.junit.Test;

public class PeepTest {

    private Peep peep = new Peep("hello");

    @Test
    public void peepHasId() {
        assertEquals(peep.getId(), 0);
    }

    @Test
    public void peepHasContent() {
        assertEquals(peep.getContent(), "hello");
    }

}
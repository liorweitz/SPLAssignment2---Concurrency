package bgu.spl.mics;

import bgu.spl.mics.application.passiveObjects.Ewok;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class EwokTest {
    private Ewok ewok;

    @BeforeEach
    void setEwok(){
        ewok = new Ewok();
    }

    @AfterEach
    void tearDown(){}

    public void setE() {
        this.ewok = new Ewok();
    }

    @Test
    public void acquire() {
        ewok.acquire();
        assertFalse(ewok.getAvailable());
    }
    @Test
    public void release() {
        ewok.release();
        assertTrue(ewok.getAvailable());
    }

}
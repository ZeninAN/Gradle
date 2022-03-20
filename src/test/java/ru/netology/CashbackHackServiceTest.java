package ru.netology;

import junit.framework.TestCase;

public class CashbackHackServiceTest extends TestCase {

    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }
}
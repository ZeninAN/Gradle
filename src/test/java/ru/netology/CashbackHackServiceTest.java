package ru.netology;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual,expected);
    }
}
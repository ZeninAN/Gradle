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
    @Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2000);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemain4() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 1000;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemain5() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1);
        int expected = 999;
        assertEquals(actual,expected);
    }
    @Test
    public void testRemain6() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual,expected);
    }
}
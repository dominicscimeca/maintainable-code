package com.cj.dscimeca.onboarding.add;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddServiceTest {
    @Test
    public void shouldReturnAddNumberEquationAsString(){
        //given
        int firstNum = 1200;
        int secondNum = 34;

        AddService addService = new AddService();

        //when
        String result = addService.add(firstNum, secondNum);

        //then
        assertEquals("1200 + 34 = 1234", result);
    }
}

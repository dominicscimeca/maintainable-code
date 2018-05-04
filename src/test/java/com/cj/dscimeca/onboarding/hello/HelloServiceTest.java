package com.cj.dscimeca.onboarding.hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    @Test
    public void shouldPrependHelloToAnyName(){
        //given
        HelloService helloService = new HelloService();
        String name = "Jerry";

        //when
        String result = helloService.hello(name);

        //then
        assertEquals("Hello, Jerry!", result);
    }
}

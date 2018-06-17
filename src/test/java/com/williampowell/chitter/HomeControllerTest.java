package com.williampowell.chitter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class HomeControllerTest {

    @MockBean
    private HomeController homeController;

    @Test
    public void runsIndex(){
        when(homeController.index()).thenCallRealMethod();
        assertEquals("index", homeController.index());
    }

}
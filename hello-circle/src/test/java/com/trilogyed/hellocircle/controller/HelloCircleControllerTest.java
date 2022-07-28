package com.trilogyed.hellocircle.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.Assert.*;

public class HelloCircleControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void shouldReturnAnswer() throws Exception {
        mockMvc.perform(get("/answer"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("The answer is 42!"));
    }

}
package com.company.M2ChallengeShelegJessica.controller;

import com.company.M2ChallengeShelegJessica.models.Month;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {
    //Wiring in the MockMVC object
    @Autowired
    private MockMvc mockMvc;

    //ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();


//    //get month by number -422 error
    @Test
    public void shouldReturn422StatusCodeIfMonthNotFound() throws Exception {
        mockMvc.perform(get("/month/-1"))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity());


    }

    //get month by Number- Success
    @Test
    public void shouldReturnMonthByMonthNumber() throws Exception {
        Month outputMonth = new Month();
        outputMonth.setMonthNumber(1);
        outputMonth.setMonthName("January");
        String outputJSon = mapper.writeValueAsString(outputMonth);
        mockMvc.perform(get("/month/1"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJSon));
    }
    //test for random month
    @Test
    public void shouldReturnRandomMonth() throws Exception{
        mockMvc.perform(
                get("/randomMonth")
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.monthNumber").isNotEmpty())  //Assert monthNumber is not empty
                .andExpect(jsonPath("$.monthName").isNotEmpty());   //Assert monthName is not empty
    }
}
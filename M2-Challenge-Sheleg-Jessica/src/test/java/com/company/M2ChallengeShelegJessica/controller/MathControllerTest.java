package com.company.M2ChallengeShelegJessica.controller;
import com.company.M2ChallengeShelegJessica.models.Math;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.lang.ArithmeticException;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MathController.class)
public class MathControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Before
    public void setUp() throws Exception {


    }

    //testing Post /add
    @Test
    public void shouldReturnAnswerOfAdditionOnPostRequest() throws Exception{
        Math inputMath = new Math();
        inputMath.setOperand1(1);
        inputMath.setOperand2(2);
        inputMath.setOperation("Add");
        inputMath.setAnswer(inputMath.getOperand1() + inputMath.getOperand2());

        String inputJson = mapper.writeValueAsString(inputMath);

        Math outputMath = new Math();
        outputMath.setOperand1(1);
        outputMath.setOperand2(2);
        outputMath.setOperation("Add");
        outputMath.setAnswer(outputMath.getOperand1() + outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(
                post("/add")
                        .content(inputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    //testing Post/add - invalid request body
//    @Test
//    public void shouldReturn422StatusCodeIfRequestBodyIsInvalid() throws Exception{
//        Math inputMath = new Math();
//        inputMath.setOperand1(1);
////        inputMath.setOperand2(2);
//        inputMath.setOperation("Add");
////        inputMath.setAnswer(inputMath.getOperand1() + inputMath.getOperand2());
//
//        String inputJson = mapper.writeValueAsString(inputMath);
//
//        mockMvc.perform(
//                post("/add")
//                        .content(inputJson)
//                        .contentType(MediaType.APPLICATION_JSON)
//        )
//                .andDo(print())
//                .andExpect(status().isUnprocessableEntity());
//
//    }




    //testing Post /subtract
    @Test
    public void shouldReturnAnswerOfSubtractionOnPostRequest() throws Exception{
        Math inputMath = new Math();
        inputMath.setOperand1(2);
        inputMath.setOperand2(1);
        inputMath.setOperation("Subtract");
        inputMath.setAnswer(inputMath.getOperand1() - inputMath.getOperand2());

        String inputJson = mapper.writeValueAsString(inputMath);

        Math outputMath = new Math();
        outputMath.setOperand1(2);
        outputMath.setOperand2(1);
        outputMath.setOperation("Subtract");
        outputMath.setAnswer(outputMath.getOperand1() - outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(
                        post("/subtract")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    // //testing Post/subtract- invalid request body

    //testing Post /multiply
    @Test
    public void shouldReturnAnswerOfMultiplicationOnPostRequest() throws Exception{
        Math inputMath = new Math();
        inputMath.setOperand1(5);
        inputMath.setOperand2(10);
        inputMath.setOperation("Multiply");
        inputMath.setAnswer(inputMath.getOperand1() * inputMath.getOperand2());

        String inputJson = mapper.writeValueAsString(inputMath);

        Math outputMath = new Math();
        outputMath.setOperand1(5);
        outputMath.setOperand2(10);
        outputMath.setOperation("Multiply");
        outputMath.setAnswer(outputMath.getOperand1() * outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(
                        post("/multiply")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    //testing Post/multiply - invalid request body

    //testing Post /divide
    @Test
    public void shouldReturnAnswerOfDivisionOnPostRequest() throws Exception{
        Math inputMath = new Math();
        inputMath.setOperand1(10);
        inputMath.setOperand2(2);
        inputMath.setOperation("Divide");
        inputMath.setAnswer(inputMath.getOperand1() / inputMath.getOperand2());

        String inputJson = mapper.writeValueAsString(inputMath);

        Math outputMath = new Math();
        outputMath.setOperand1(10);
        outputMath.setOperand2(2);
        outputMath.setOperation("Divide");
        outputMath.setAnswer(outputMath.getOperand1() / outputMath.getOperand2());

        String outputJson = mapper.writeValueAsString(outputMath);

        mockMvc.perform(
                        post("/divide")
                                .content(inputJson)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJson));

    }

    //testing Post/divide - invalid request body

    //testing Post/divide - divide by zero
//    @Test
//    public void shouldReturn422IfZeroInBody() throws Exception{


//        Math inputMath = new Math();
//        inputMath.setOperand1(10);
//        inputMath.setOperand2(0);
//        inputMath.setOperation("Divide");
//        inputMath.setAnswer(inputMath.getOperand1() / inputMath.getOperand2());
//
//        String inputJson = mapper.writeValueAsString(inputMath);
//
//        Math outputMath = new Math();
//        outputMath.setOperand1(10);
//        outputMath.setOperand2(2);
//        outputMath.setOperation("Divide");
//        outputMath.setAnswer(outputMath.getOperand1() / outputMath.getOperand2());
//
//        String outputJson = mapper.writeValueAsString(outputMath);
//
//        mockMvc.perform(
//                        post("/divide")
//                                .content(inputJson)
//                                .contentType(MediaType.APPLICATION_JSON)
//                )
//                .andDo(print())
//                .andExpect((status().ArithmeticException));
//
//    }





}
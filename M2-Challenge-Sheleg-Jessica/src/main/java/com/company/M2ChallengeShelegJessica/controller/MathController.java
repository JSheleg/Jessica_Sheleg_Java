package com.company.M2ChallengeShelegJessica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.company.M2ChallengeShelegJessica.models.Math;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
public class MathController {

    //post-add "/add"
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Math add(@RequestBody @Valid Math math){
          math.setAnswer(math.getOperand1() + math.getOperand2());
          math.setOperation("Add");
          return math;
    }

    //post-subtract "/subtract"
    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Math subtract( @RequestBody @Valid Math math){
        math.setAnswer(math.getOperand1() - math.getOperand2());
        math.setOperation("Subtract");
        return math;
    }

    //post-multiply "/multiply"
    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Math multiply( @RequestBody @Valid Math math){
        math.setAnswer(math.getOperand1() * math.getOperand2());
        math.setOperation("Multiply");
        return math;
    }

    //post-divide "/divide"
    @RequestMapping(value = "/divide", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Math divide( @RequestBody @Valid Math math ){
        math.setAnswer(math.getOperand1() / math.getOperand2());
        math.setOperation("Divide");
        return math;
    }
}

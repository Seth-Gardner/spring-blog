package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class DiceRoll {

    @GetMapping("/dice")
    public String showDiceForm(){
        return "dice";
    }

    @PostMapping("/dice")
    public String guessNumber(@RequestParam(name = "guess") int guess, Model model){
        int result = ThreadLocalRandom.current().nextInt(1, 6 + 1);


        if(result == guess){
            model.addAttribute("result", "Correct! The number was " + result + "!");
        } else{
            model.addAttribute("result", "Sorry, the number was " + result + ".");
        }

        return "dice";
    }


}

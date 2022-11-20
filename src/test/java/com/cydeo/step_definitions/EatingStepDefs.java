package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingStepDefs {
    @Given("{string} is hungry")
    public void somebodyIsHungry(String name)  {
        System.out.println("This is from" + name  + " is hungry");

    }


    @When("He eats {int} cucumbers")
    public void heEatsCucumbers(int quantity) {
        System.out.println("He eats " + quantity + " cucumber");

    }

    @Then("He will be full")
    public void heWillBeFull()  {
        System.out.println("This is from");

    }
}

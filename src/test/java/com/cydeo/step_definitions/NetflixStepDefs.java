package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixStepDefs {

    @Given("I like {string}")
    public void i_like(String movieGenre) {
        System.out.println("Step Given i like " + movieGenre);
    }

    @Given("I like")
    public void i_like(List<String> movieTypes) {

        System.out.println(movieTypes);

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type(Map<String, String> favMovieMap){

        System.out.println(favMovieMap);
        System.out.println(favMovieMap.get("actions"));
        System.out.println(favMovieMap.get("drama"));
        System.out.println(favMovieMap.get("cartoon"));
        System.out.println(favMovieMap.get("adventure"));


        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I like below movies with rating")
    public void i_like_below_movies_with_rating(List<List<String>> moviesList) {

        System.out.println(moviesList);
        System.out.println("First row moviesList.get(0) = " + moviesList.get(0));
        System.out.println("Second row moviesList.get(1) = " + moviesList.get(1));
        System.out.println("Third row moviesList.get(2) = " + moviesList.get(2));
        System.out.println("Fourth row second column moviesList.get(3).get(1) = " + moviesList.get(3).get(1));

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I like below movies table with rating")
    public void i_like_below_movies_table_with_rating(List<Map<String,String>> movieMapList) {

        System.out.println("movieMapList = " + movieMapList);

        System.out.println("movieMapList.get(0) = " + movieMapList.get(0));
        System.out.println("movieMapList.get(2) = " + movieMapList.get(2));

        //forth row name column
        System.out.println("Forth row name column movieMapList.get(3).get(\"Name\") = " + movieMapList.get(3).get("Name"));

        //first row Genre column
        System.out.println("First row Genre column movieMapList.get(0).get(\"Genre\") = " + movieMapList.get(0).get("Genre"));

    }


    @When("I go to homepage")
    public void i_go_to_homepage() {
        System.out.println("Step When I go to homepage");
    }
    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {
        System.out.println("Step Then I should get right recommendation");
    }



}

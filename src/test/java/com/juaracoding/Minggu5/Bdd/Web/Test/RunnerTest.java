package com.juaracoding.Minggu5.Bdd.Web.Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		features = {"src/main/resources/features"}
		)
public class RunnerTest {

}

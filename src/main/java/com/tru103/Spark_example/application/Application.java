package com.tru103.Spark_example.application;

import static spark.Spark.*;

import spark.SparkBase;

public class Application extends SparkBase {
	
	 public static void main(String[] args) {
	        get("/hello", (req, res) -> "Hello World");
	    }

}

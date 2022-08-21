package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;
import java.util.Properties;

public class Utility {
    Properties properties = new Properties();

    public Response getUrlResponse(Map<String, String> queryParam, String path) {
        try {
            RequestSpecification request = RestAssured.given();
            request.queryParams(queryParam);
            Response response = request.get(path);
            request.given().log().uri();
            return response;
        }catch (Exception e){
          //  Reporter.addStepLog("Exception occurred while making Get request");
            return null;
        }
    }

    public Response postReuqestWithBody(String body, String path) {
        Response response = null;
        try {
            RequestSpecification request = RestAssured.given();
            request.body(body);
            response = request.post(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }

}

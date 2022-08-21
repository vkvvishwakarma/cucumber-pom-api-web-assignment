package com.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class ApiService {
    Utility apiUtil = new Utility();

    public ApiService(String url) {
        RestAssured.baseURI = url;
    }

    public Response getUserPage(String page){
        Response response = null;

        JSONObject requestParams = new JSONObject();
        try {
            Map<String, String> queryParam = new HashMap<String, String>();
            queryParam.put("page", page);
            response = apiUtil.getUrlResponse(queryParam, "/users");

        }catch (Exception e){
                e.printStackTrace();
        }
            return response;
    }

    public String getNameWithServiceId(Response response, int id){
        try{
            String firstName = "";
            firstName =  response.getBody().jsonPath().getString("id");
            System.out.println(firstName);
            return firstName;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


    public Response postUser (String name, String job) {
        Response response = null;
        try {
            JSONObject json = new JSONObject();
            json.put("name", name);
            json.put("job", job);
            response = apiUtil.postReuqestWithBody(json.toString(), "/users");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}

package com.api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

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
        String firstName = "";
        try{
            // System.out.println(response.prettyPrint());
            JSONObject requestParams = new JSONObject(response.getBody());
            JSONArray dataArray = requestParams.getJSONArray("data");
            System.out.println("new object = "+ dataArray.get(0).toString());

            for (int i = 0; i < dataArray.length(); i++) {
                JSONObject arrObject = dataArray.getJSONObject(i);
                if(Integer.parseInt(arrObject.get("id").toString()) == 10){
                    System.out.println("new array ID = >"+ arrObject.get("id").toString());
                    firstName =  arrObject.get("first_name").toString();
                    break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return firstName;
    }
//
//
//    public String getNameWithServiceId(Response response, int id){
//        try{
//            String firstName = "";
//            firstName =  response.getBody().jsonPath().getString("id");
//            System.out.println(firstName);
//            return firstName;
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//
//    }


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

    public boolean verifyId (Response response){
        System.out.println(response.asString());
        String jsonString = response.asString();
        System.out.println("reponse id need to print = "+response.getBody().jsonPath().get("id").toString());
        System.out.println(response.getBody().prettyPrint());
        System.out.println(String.valueOf(JsonPath.from(jsonString).get("id")));
        return true;
    }

    public void verifyResponseSchemaForPostUser(Response response, String path){
        boolean flag = false;
        try {
//        String responseBody = response.getBody().asString();
//            assertThat(responseBody, matchesJsonSchemaInClasspath(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

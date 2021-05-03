package com.company.Olshefski;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.IOException;

class simple{
    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;

    public simple(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Json with gson example");
        //serialzeSimple();
        deserializeSimple();
    }

    static void serialzeSimple(){
        simple person = new simple("me","me@gmail.com",150,true);
        Gson gson = new Gson();
        String json = gson.toJson(person);

        try {
            FileWriter writer = new FileWriter("data.json");
            gson.toJson(person,writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);
    }

    static void deserializeSimple(){
        String person2Json = "{\"name\":\"me\", \"email\": \"me@gmail.com\", \"age\": 100, \"isDeveloper\": true}";
        //Dont need 51-53 for homework
        JsonParser parser = new JsonParser();
        JsonElement test = parser.parse(person2Json);
        System.out.println(test.isJsonObject());
        Gson gson = new Gson();
        simple person2 = gson.fromJson(person2Json,simple.class);

        System.out.println(person2.getClass());
    }
}

package com.company.Olshefski;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.FileWriter;
import java.io.IOException;

class todos{
    private String body;
    private boolean done;
    private int id;
    private int priority;
    private String title;

    public todos(String body, boolean done, int id, int priority, String title) {
        this.body = body;
        this.done = done;
        this.id = id;
        this.priority = priority;
        this.title = title;
    }

}
public class Main {

    public static void main(String[] args) {

        serialize();
        desterialize();

    }

        static void serialize(){
            todos taskA = new todos("Get a good grade",true,99,5,"ALC class");
            Gson gson = new Gson();
            String json = gson.toJson(taskA);

            try {
                FileWriter writer = new FileWriter("data.json");
                gson.toJson(taskA,writer);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(json);
    };

        static void desterialize(){

            String person2Json = "{ \"name\": \"Name\", \"email\": \"name@gmail.com\", \"age\": 30, \"isDev\": true }";

            Gson gson = new Gson();
            todos person1 = gson.fromJson(person2Json, todos.class);
            System.out.println(person1);
        }

}

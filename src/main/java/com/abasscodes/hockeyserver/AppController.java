package com.abasscodes.hockeyserver;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@RestController
public class AppController {
    String rosterJsonFilePath = "src/resources/roster.json";

    @RequestMapping("/api/v1/roster")
    @JsonFormat
    public ContactWrapper loadRoster(@RequestParam(value = "name", defaultValue = "World") String name) {
        Gson gson = new GsonBuilder()
                .setLenient()
                .setPrettyPrinting()
                .create();
        File file = new File(rosterJsonFilePath);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                stringBuilder.append(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return gson.fromJson(stringBuilder.toString(), ContactWrapper.class);
    }

    @RequestMapping(value="jsp")
    public String startJsp(){
        return "/test.jsp";
    }

    @RequestMapping(value="html")
    public String startHtml(){
        return "/test.html";
    }
}

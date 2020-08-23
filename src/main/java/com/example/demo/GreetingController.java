package com.example.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {


    @GetMapping("/greeting")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "Hadar") String name) {
        return new Greeting(1, name);
    }

    @PostMapping(path = "/calculateNameLength", consumes = "application/json", produces = "application/json")
    public String calculate(@RequestBody Greeting greeting) {
        JSONObject json = new JSONObject();
        try {
            json.put("nameLength", greeting.getContent().length());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }

}

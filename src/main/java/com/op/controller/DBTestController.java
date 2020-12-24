package com.op.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.op.db.MySQLRepository;
import com.op.firebird.FireBirdRepository;

import org.json.JSONObject;

@RestController
class DBTestController {

    private final MySQLRepository repository;
    //private final FireBirdRepository fireBirdRepository;

    DBTestController(MySQLRepository repository ) { //, FireBirdRepository fireBirdRepository) {
        this.repository = repository;
       // this.fireBirdRepository = fireBirdRepository;
    }

    @PostMapping("/dbloadtest")
    public String dbloadtest(@RequestBody String payload) {
        System.out.println("json string >> " + payload);
        JSONObject obj = new JSONObject(payload);
        System.out.println("json string >> " + obj.get("query"));
        System.out.println("json string >> " + obj.get("type"));
        if(obj.get("type").toString().equals("select")) {
            repository.select(obj.get("query").toString());
        }else{
            repository.insertorupdate(obj.get("query").toString());
        }
        return "{ \"result\" : \"true\" }";
    }

    /*@PostMapping("/firebirdloadtest")
    public String firebirdloadtest(@RequestBody String payload) {
        System.out.println("json string >> " + payload);
        JSONObject obj = new JSONObject(payload);
        System.out.println("json string >> " + obj.get("query"));
        System.out.println("json string >> " + obj.get("type"));
        if(obj.get("type").toString().equals("select")) {
            fireBirdRepository.select(obj.get("query").toString());
        }else{
            fireBirdRepository.insertorupdate(obj.get("query").toString());
        }
        return "true";
    }*/
}
package com.test.blinkapp.demo.controller;


import com.test.blinkapp.demo.repo.IndexRepo;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class IndexController {
    private final IndexRepo indexRepo;

    @Autowired

    public IndexController(IndexRepo indexRepo) {
        this.indexRepo = indexRepo;
    }

    @GetMapping(value = "/")
    public String getIndex(){
        return "index";
    }

    @PostMapping(value = "/")
    @ResponseBody
    public ResponseEntity<Object> getResult(ModelMap model, @RequestParam String a, @RequestParam String b, @RequestParam String button ) throws JSONException {
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int c = 0;
        int f = indexRepo.findById(1L).get().getNum();
        if (button.equals("button1")) {
            c = (a1 + b1)+ f;
        } else {
            c = (a1 - b1)+ f;
        }

        List<JSONObject> jsonpObjects = new ArrayList<JSONObject>();
        JSONObject jsonpObject = new JSONObject();
        jsonpObject.put("var", c);


        //model.put("var", c);
        return new ResponseEntity<>(jsonpObject.toString(), HttpStatus.OK);
    }
}

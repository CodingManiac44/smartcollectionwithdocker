package com.collection.app.controller;

import com.collection.app.Service;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.RestController1;

import java.util.ArrayList;

@org.springframework.web.bind.annotation.RestController
public class RestController1 {
    @GetMapping("/printCollection")
    public ArrayList<Object> printCollection() {
        return Service.printCollectionList();
    }
}

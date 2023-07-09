package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.PayloadPurchaseClass;
import com.codebrewers.mainbackend.service.PayloadPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/purchase_ingredient")
public class PayloadPurchaseController {

    @Autowired
    private PayloadPurchaseService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/payload/all
     * @return All payload in the DB
     */

    @PostMapping(path = "/purchase")
    public void postNewPayload(@RequestBody PayloadPurchaseClass newPayload) {
        service.purchase_ingredient(newPayload);
    }
}

package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.IngredientsClass;
import com.codebrewers.mainbackend.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/ingredients")
public class IngredientsController {

    @Autowired
    private IngredientsService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/ingredients/all
     * @return All ingredients in the DB
     */
    @GetMapping(path = "/all")
    public List<IngredientsClass> getAllIngredientsController() {
        return service.findAllIngredients();
    }

    @PostMapping(path = "/add")
    public void postNewIngredient(@RequestBody IngredientsClass newIngredient) {
        service.addIngredient(newIngredient);
    }

    @PostMapping(path = "/remove")
    public void deleteIngredient(@RequestBody IngredientsClass newIngredient) {
        service.removeIngredient(newIngredient);
    }
}

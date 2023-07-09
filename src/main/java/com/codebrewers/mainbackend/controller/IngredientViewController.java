package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.service.IngredientViewService;
import com.codebrewers.mainbackend.views.IngredientView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_ingredient_view")
public class IngredientViewController {

    @Autowired
    private IngredientViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/display_ingredient_view/all
     * @return All display_ingredient_view in the DB
     */
    @GetMapping(path = "/all")
    public List<IngredientView> getIngredientView() {
        return service.displayAllIngredient();
    }

}

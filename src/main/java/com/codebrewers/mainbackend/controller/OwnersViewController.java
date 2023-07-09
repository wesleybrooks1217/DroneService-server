package com.codebrewers.mainbackend.controller;

import com.codebrewers.mainbackend.Class.UsersClass;
import com.codebrewers.mainbackend.service.OwnersViewService;
import com.codebrewers.mainbackend.views.OwnersView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/display_owner_view")
public class OwnersViewController {

    @Autowired
    private OwnersViewService service;

    /**
     * Controller to get all the user in the DB.
     * http://localhost:8081/restaurant_owners/all
     * @return All restaurant_owners in the DB
     */
    @GetMapping(path = "/all")
    public List<OwnersView> getOwnersView() {
        return service.displayAllOwner();
    }

}

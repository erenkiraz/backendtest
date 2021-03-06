package com.example.backendtest.controller;

import com.example.backendtest.model.RouteResult;
import com.example.backendtest.service.RouterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouterController {

    @Autowired
    private RouterService routerService;

    @GetMapping("/routing/{from}/{to}")
    public RouteResult route(
            @PathVariable String from,
            @PathVariable String to
    ) {
        RouteResult result = new RouteResult();
        result.setRoute(routerService.route(from, to));
        return result;
    }
}

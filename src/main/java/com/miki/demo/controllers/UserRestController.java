package com.miki.demo.controllers;

import com.miki.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.JsonNode;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService service;

    @GetMapping("/test")
    public ResponseEntity<JsonNode> test() {
        var node = service.getTestUser();
        return ResponseEntity.ok(node);
    }
}

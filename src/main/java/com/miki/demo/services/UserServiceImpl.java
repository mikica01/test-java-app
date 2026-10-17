package com.miki.demo.services;

import com.miki.demo.entities.User;
import org.springframework.stereotype.Service;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.node.ObjectNode;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public JsonNode getTestUser() {
        var user1 = User.builder()
            .age(20)
            .name("whoever")
            .email("whatever@domain.com")
            .password("test")
            .build();

        var user2 = User.builder()
            .age(22)
            .name("whoever")
            .email("whatever@domain.com")
            .password("test")
            .build();
        var node = new ObjectMapper().convertValue(user1, ObjectNode.class);
        node.set("sibling", new ObjectMapper().convertValue(user2, ObjectNode.class));

        return node;
    }
}

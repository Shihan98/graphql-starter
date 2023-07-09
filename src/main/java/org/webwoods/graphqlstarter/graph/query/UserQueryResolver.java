package org.webwoods.graphqlstarter.graph.query;


import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webwoods.graphqlstarter.domain.UserEntity;
import org.webwoods.graphqlstarter.graph.service.UserService;

import java.util.List;

@Service
public class UserQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private UserService userService;

    public UserQueryResolver(UserService userService) {
        this.userService = userService;
    }

    public List<UserEntity> userAll() {
        return userService.findAll();
    }
    public UserEntity userById(Integer id) {
        return userService.findById(id);
    }
}

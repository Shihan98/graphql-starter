package org.webwoods.graphqlstarter.graph.service;

import org.webwoods.graphqlstarter.domain.UserEntity;
import org.webwoods.graphqlstarter.dto.UserDto;

import java.util.List;

public interface UserService {
    String createUser(UserDto userDto);
    UserEntity findById(Integer id);

    List<UserEntity> findAll();
}

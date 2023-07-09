package org.webwoods.graphqlstarter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.webwoods.graphqlstarter.domain.UserEntity;
import org.webwoods.graphqlstarter.dto.UserDto;
import org.webwoods.graphqlstarter.graph.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @MutationMapping
    public UserEntity createUser(@Argument UserDto userDto) {
        //UserDto userDto = new UserDto(email,fullName,presentAddress,permanentAddress,gender,dob);

        try {
            return userService.createUser(userDto);
        }catch (Exception e){
            throw e;
        }

    }
    @QueryMapping
    public List<UserEntity> userAll() {
        return userService.findAll();
    }
}
//    @Argument  String email,@Argument String fullName,
//    @Argument String presentAddress ,@Argument String permanentAddress,
//    @Argument String gender,@Argument String dob
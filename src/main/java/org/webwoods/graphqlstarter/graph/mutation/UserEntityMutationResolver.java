package org.webwoods.graphqlstarter.graph.mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.webwoods.graphqlstarter.domain.UserEntity;
import org.webwoods.graphqlstarter.dto.UserDto;
import org.webwoods.graphqlstarter.graph.service.UserService;

@Service
public class UserEntityMutationResolver implements GraphQLMutationResolver {
    private UserService userService;

    @Autowired
    public UserEntityMutationResolver(UserService userService) {
        this.userService = userService;
    }

    public UserEntity createUser(UserDto userDto) {
        System.out.println("crjjj");
        try {
            return userService.createUser(userDto);
        }catch (Exception e){
            throw e;
        }

    }

//    @Autowired
//    public UserMutationResolver(UserService userService) {
//        this.userService = userService;
//    }
//
//    public UserEntity createUser(String fullName,String email,String dob, String gender,
//                                 String presentAddress, String permanentAddress) {
//        return userService.createUser(fullName, email, gender, dob, presentAddress, permanentAddress);
//    }
}

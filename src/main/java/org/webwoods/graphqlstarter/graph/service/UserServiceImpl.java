package org.webwoods.graphqlstarter.graph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webwoods.graphqlstarter.domain.UserEntity;
import org.webwoods.graphqlstarter.dto.UserDto;
import org.webwoods.graphqlstarter.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserEntity createUser(UserDto userDto) {
        System.out.println("create user");
        UserEntity userEntity = new UserEntity(
                userDto.getFullName(),
                userDto.getEmail(),
                userDto.getDob(),
                userDto.getGender(),
                userDto.getPresentAddress(),
                userDto.getPermanentAddress()
        );


       return userRepository.save(userEntity);

    }

    @Override
    public UserEntity findById(Integer id) {
        System.out.println("find by id");
        Optional<UserEntity> userEntityOptional = userRepository.findById(id);
        return userEntityOptional.orElse(null);
    }

    @Override
    public List<UserEntity> findAll() {
        System.out.println("findall");
        return userRepository.findAll();
    }
}

package com.app.Restaurant.usermodel.service;


import com.app.Restaurant.usermodel.Requests.UsersRequest;
import com.app.Restaurant.usermodel.model.Users;
import com.app.Restaurant.usermodel.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsersServiceImpl implements UsersService {
    private final UsersRepository usersRepository;

    public List<Users> GetAllUsers() {
        return usersRepository.findAll();
    }

    public Users AddUser(UsersRequest user) {
        Users newUser = new Users();
        newUser.setFirst_name(user.getFirst_name());
        newUser.setLast_name(user.getLast_name());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        newUser.setRoles(user.getRoles());
        return usersRepository.save(newUser);
    }
}

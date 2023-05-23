package com.app.Restaurant.usermodel.controller;


import com.app.Restaurant.usermodel.Requests.UsersRequest;
import com.app.Restaurant.usermodel.model.Users;
import com.app.Restaurant.usermodel.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class UsersController {

    private final UsersService usersService;

    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    @GetMapping("")
    public List<Users> GetUsers() {
        return usersService.GetAllUsers();
    }

    @PreAuthorize(value = "hasRole('ROLE_ADMIN')")
    @PostMapping("")
    public Users GetUsers(@RequestBody UsersRequest user) {
        return usersService.AddUser(user);
    }

}

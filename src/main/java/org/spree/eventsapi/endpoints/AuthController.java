package org.spree.eventsapi.endpoints;

import org.spree.core.users.User;
import org.spree.core.users.Users;
import org.spree.eventsapi.endpoints.response.AuthResponse;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.spree.eventsapi.endpoints.response.AuthResponse.fail;

@RestController
public class AuthController {

    private final Users users;

    public AuthController(Users users) {
        this.users = users;
    }

    @RequestMapping(path = "auth")
    public AuthResponse authenticate(@Param("userId")String userName, @Param("password") String password) {
        User user = users.get(userName);
        if (user == null || !user.getPassword().equals(password)) {
            return fail("Неверное имя пользователя или пароль.");
        } else {
            String token = UUID.randomUUID().toString();
            user.setToken(token);
            return AuthResponse.success(token);
        }
    }
}

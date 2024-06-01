package com.narvatov.user_service.service;

import com.narvatov.user_service.dao.UserDao;
import com.narvatov.user_service.dto.response.SimpleUserDTO;
import com.narvatov.user_service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao dao;
//    @Autowired
//    private JwtService jwtService;

    public Optional<User> findByEmail(String email) {
        return dao.findByEmail(email);
    }

    public void save(User user) {
        dao.save(user);
    }

    public long countUsers() {
        return dao.count();
    }

    public SimpleUserDTO get(int id) {
        return new SimpleUserDTO(dao.findById(id).orElseThrow());
    }

//    public User extractUserFromAuthHeader(String authHeader) {
//        String jwt = AuthUtils.getJwt(authHeader);
//
//        String email = jwtService.extractUserName(jwt);
//
//        return findByEmail(email).orElseThrow(() -> new IllegalStateException(
//                "Couldn't extract user from authHeader. Email is " + email + ", jwt is " + jwt +
//                        ", authHeader is " + authHeader + "."));
//    }

}

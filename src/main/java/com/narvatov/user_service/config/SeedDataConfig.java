package com.narvatov.user_service.config;

import com.narvatov.user_service.model.Role;
import com.narvatov.user_service.model.User;
import com.narvatov.user_service.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SeedDataConfig implements CommandLineRunner {

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        if (userService.countUsers() > 0) return;

        User admin = User.builder()
            .firstName("admin")
            .lastName("admin")
            .email("admin@admin.com")
//            .password(passwordEncoder.encode("password"))
            .password("password")
            .role(Role.ROLE_ADMIN)
            .build();

        userService.save(admin);
        log.debug("created ADMIN user - {}", admin);
    }

}

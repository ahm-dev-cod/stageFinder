package com.stagefinder.security;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username.equals("admin@example.com")) {
            return new User("admin@example.com", "{noop}admin123", new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Utilisateur non trouvé : " + username);
        }
    }
}

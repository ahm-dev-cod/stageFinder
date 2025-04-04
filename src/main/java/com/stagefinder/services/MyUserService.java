package com.stagefinder.services;
import com.stagefinder.dto.MyUserDTO;
import com.stagefinder.entities.enums.Role;

import java.util.List;

public interface MyUserService {
    List<MyUserDTO> getAllMyUsers();
    MyUserDTO getMyUserById(Long id);
    MyUserDTO createMyUser(MyUserDTO dto);
    MyUserDTO updateMyUser(MyUserDTO dto);
    void deleteMyUser(Long id);

    MyUserDTO findByEmail(String email);
    MyUserDTO findByNom(String nom);
    List<MyUserDTO> findByRole(Role role);


}

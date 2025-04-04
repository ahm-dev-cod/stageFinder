package com.stagefinder.services;

import com.stagefinder.dto.MyUserDTO;
import com.stagefinder.entities.MyUser;
import com.stagefinder.entities.enums.Role;
import com.stagefinder.map.MyUserMapper;
import com.stagefinder.dao.MyUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class MyUserServiceImpl implements MyUserService {

    private MyUserRepository myUserRepository;
    private MyUserMapper myUserMapper;
//    private CandidatureRepository candidatureRepository;
//    private MyUserMapper myUserMapper;
//    private CandidatureMapper candidatureMapper;
//    private NotificationMapper notificationMapper;
//    private FavorisMapper favorisMapper;
//    private AbonnementMapper abonnementMapper;
//    private NotesOffreMapper notesOffreMapper;
//    private OffreMapper offreMapper;

    // ########## CRUD ##################
    @Override
    public List<MyUserDTO> getAllMyUsers() {
        return myUserRepository.findAll().stream()
                .map(myUserMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public MyUserDTO getMyUserById(Long id) {
        MyUser user = myUserRepository.findById(id).orElse(null);
        return user != null ? myUserMapper.toDto(user) : null;
    }

    @Override
    public MyUserDTO createMyUser(MyUserDTO dto) {
        MyUser user = myUserMapper.toEntity(dto);
        user = myUserRepository.save(user);
        return myUserMapper.toDto(user);
    }

    @Override
    public MyUserDTO updateMyUser(MyUserDTO dto) {
        MyUser user = myUserRepository.findById(dto.getId()).orElse(null);
        if (user == null) {
            return null;
        }
        MyUser updatedUser = myUserMapper.toEntity(dto);
        updatedUser = myUserRepository.save(updatedUser);
        return myUserMapper.toDto(updatedUser);
    }

    @Override
    public void deleteMyUser(Long id) {
        myUserRepository.deleteById(id);
    }

    // ########## getbynom, email, roleDesUsers ##################
    @Override
    public MyUserDTO findByEmail(String email) {
        MyUser user = myUserRepository.findByEmail(email).orElse(null);
        return user != null ? myUserMapper.toDto(user) : null;
    }

    @Override
    public MyUserDTO findByNom(String nom) {
        MyUser user = myUserRepository.findByNom(nom).orElse(null);
        return user != null ? myUserMapper.toDto(user) : null;
    }

    @Override
    public List<MyUserDTO> findByRole(Role role) {
        return myUserRepository.findByRole(role).stream()
                .map(myUserMapper::toDto)
                .collect(Collectors.toList());
    }


    // ##########  ##################

}

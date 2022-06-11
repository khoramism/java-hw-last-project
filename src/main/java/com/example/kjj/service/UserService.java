package com.example.kjj.service;
import com.example.kjj.exception.EmailAlreadyExistException;
import com.example.kjj.exception.UsernameAlreadyExistException;
import com.example.kjj.dto.UserDto;
import com.example.kjj.models.UserEntity;
import com.example.kjj.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



public class UserService {

    private UserRepository userRepository;

    BCryptPasswordEncoder passwordEncoder;


    public void register(UserDto user) throws EmailAlreadyExistException, UsernameAlreadyExistException {

        if(checkIfUserExistByEmail(user.getEmail())){
            throw new EmailAlreadyExistException("email is already taken!");
        }
        if(checkIfUserExistByUsername(user.getUsername())){
            throw new UsernameAlreadyExistException("Username is already taken!");
        }
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());
        userEntity.setUsername(user.getUsername());
        userEntity.setEmail(user.getEmail());
//        BeanUtils.copyProperties(user, userEntity);
        encodePassword(userEntity, user);
//        userEntity.setRoles(Set.of("ROLE_USER"));
        userRepository.save(userEntity);
    }


    public boolean checkIfUserExistByEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public boolean checkIfUserExistByUsername(String username) {
        return userRepository.findByUsername(username).isPresent();
    }
    private void encodePassword( UserEntity userEntity, UserDto user){
        userEntity.setPassword(passwordEncoder.encode(user.getPassword()));
    }
}

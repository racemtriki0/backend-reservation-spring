package com.project.onligneappointment.persistance.dao;


import com.project.onligneappointment.persistance.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User saveUser(User user);
    User updateUser(User user);
    boolean deleteUser(Long id);
    User validateUser(String email, String password);
    User findByEmailAndPassword(String email, String password);

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}

package com.ingram.overlap.application.repository;

import com.ingram.overlap.domain.user.User;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends Repository<User, String> {

    List<User> findByUserNameStartsWith(String userName);

    Optional<User> findByUserName(String userName);
}

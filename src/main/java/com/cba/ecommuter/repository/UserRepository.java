package com.cba.ecommuter.repository;

import com.cba.ecommuter.model.User;
import com.cba.ecommuter.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    User findByUserName(String userName);

//    User findByUserNameAndUserType(String userName, UserType userType);

    Optional<User> findByUserNameAndUserType(String userName, UserType userType);

}

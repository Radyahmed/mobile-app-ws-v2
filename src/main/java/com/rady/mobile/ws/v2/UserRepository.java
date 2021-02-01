package com.rady.mobile.ws.v2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rady.mobile.ws.v2.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
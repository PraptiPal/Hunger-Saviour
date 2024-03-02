package org.hunger.saviour.portal.user.service.repositories;

import org.hunger.saviour.portal.user.service.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);
}

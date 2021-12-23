package org.mykola.sarafan2.repository;

import org.mykola.sarafan2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User, String> {

}

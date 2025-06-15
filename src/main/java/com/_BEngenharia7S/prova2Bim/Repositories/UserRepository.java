package com._BEngenharia7S.prova2Bim.Repositories;

import com._BEngenharia7S.prova2Bim.Domain.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
package pl.kurzelakamil.bettingapp.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.kurzelakamil.bettingapp.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

package pl.kurzelakamil.bettingapp.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pl.kurzelakamil.bettingapp.userservice.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

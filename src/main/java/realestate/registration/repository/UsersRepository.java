package realestate.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import realestate.registration.model.UsersModel;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersModel, Integer> {
    Optional<UsersModel> findByLoginandPassword(String login, String Password);

}

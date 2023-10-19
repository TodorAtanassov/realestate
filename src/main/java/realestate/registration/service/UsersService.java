package realestate.registration.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realestate.registration.model.UsersModel;
import realestate.registration.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersModel registerUser(String login, String email, String password) {
        if (login == null && password == null) {
            return null;
        } else {
            UsersModel usersModel = new UsersModel();
            usersModel.setLogin(login);
            usersModel.setEmail(email);
            usersModel.setPassword(password);
            return usersRepository.save(usersModel);
        }

    }

    public UsersModel authenticate(String login, String password){
        return usersRepository.findByLoginandPassword(login, password).orElse(null);

    }
}

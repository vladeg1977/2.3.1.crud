package webcrud.service;

import webcrud.model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);
    public List<User> listUsers();
    public void updateUser(User user);
    public void deleteUser(Long id);
    public User getUserById(Long id);
}

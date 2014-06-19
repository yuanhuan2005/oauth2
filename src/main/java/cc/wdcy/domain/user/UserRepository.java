package cc.wdcy.domain.user;

/**
 * @author Shengzhao Li
 */

public interface UserRepository{

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);

}
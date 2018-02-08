package cn.alianyi.dailylife.commondao.service;

import cn.alianyi.dailylife.commondao.dao.User;
import cn.alianyi.dailylife.commondao.dao.UserRepos;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl {

    @Autowired
    private UserRepos userPeosw;
    public void saveUser(User user){
        userPeosw.save(user);
    }
}

package cn.alianyi.dailylife.commondao.service;

import cn.alianyi.dailylife.commondao.dao.User;
import cn.alianyi.dailylife.commondao.dao.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepos userRepos;
    public void saveUser(User user){
        userRepos.save(user);
    }
}

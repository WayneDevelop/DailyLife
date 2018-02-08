package cn.alianyi.dailylife.commondao.service;

import cn.alianyi.dailylife.commondao.dao.UserRepos;
import cn.alianyi.dailylife.commoninterface.domain.User;
import cn.alianyi.dailylife.commoninterface.service.IUserService;
import com.alibaba.dubbo.config.annotation.Service;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepos userRepos;

    @Override
    public void saveUser(User user) {
        cn.alianyi.dailylife.commondao.dao.User userdao = new  cn.alianyi.dailylife.commondao.dao.User();
        userdao.setRegion(user.getRegion());
        userdao.setRegisterTime(user.getRegisterTime());
        userdao.setPassword(user.getPassword());
        userdao.setMobileNo(user.getMobileNo());
        userdao.setHeadPortrait(user.getHeadPortrait());
        userdao.setEmail(user.getEmail());
        userRepos.save(userdao);
    }
}

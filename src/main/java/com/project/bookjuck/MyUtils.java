package com.project.bookjuck;

import com.project.bookjuck.user.UserMapper;
import com.project.bookjuck.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component("utils")
public class MyUtils {
    @Autowired
    private HttpSession hs;

    @Autowired
    private UserMapper mapper;

    public void setLoginUser(UserEntity entity){
        hs.setAttribute("loginUser", entity);
    }

    public UserEntity getLoginUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String uid = auth.getName();
        UserEntity entity = new UserEntity();
        entity.setUid(uid);
        return mapper.selUser(entity);
    }

    public int getLoginUserPk() {
        return getLoginUser().getIuser();
    }
}

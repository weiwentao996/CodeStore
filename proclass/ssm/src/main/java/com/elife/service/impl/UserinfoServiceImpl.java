package com.elife.service.impl;

import com.elife.mapper.UserinfoMapper;
import com.elife.pojo.BookinfoExample;
import com.elife.pojo.Userinfo;
import com.elife.pojo.UserinfoExample;
import com.elife.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoServiceImpl implements UserinfoService {
    @Autowired
    UserinfoMapper userinfoMapper;

    public Userinfo login(String username, String pwd) {
        // 使用逆向工程生成代码的实现方式
        System.out.println("------------------");
        System.out.println(username);
        System.out.println(pwd);
        System.out.println("------------------");
        UserinfoExample userinfoExample = new UserinfoExample();
        UserinfoExample.Criteria criteria = userinfoExample.createCriteria();
        criteria.andUserNameEqualTo(username);
        criteria.andUserPwdEqualTo(pwd);
        List<Userinfo> userInfos = userinfoMapper.selectByExample(userinfoExample);

        if(null != userInfos && userInfos.size() > 0) {
            return userInfos.get(0);
        }
        return null;
    }
}

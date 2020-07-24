package com.JZhi;


import com.JZhi.project.entity.User;
import com.JZhi.project.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class userTest {

    @Autowired
    private IUserService userService;

    @Test
    public void userAdd(){
        User user = new User();
        user.setPassword("123456");
        user.setUsername("com.JZhi");
        user.setRoleId(2);

        userService.save(user);
    }

}

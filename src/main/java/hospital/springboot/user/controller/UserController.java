package hospital.springboot.user.controller;


import hospital.springboot.user.service.UserService;
import hospital.springboot.user.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@Slf4j
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public List<UserVO> test() throws Exception{
        List<UserVO> userList = userService.selectUser();
        return userList;
    }
}

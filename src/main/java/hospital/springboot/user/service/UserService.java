package hospital.springboot.user.service;

import hospital.springboot.user.service.mapper.UserMapper;
import hospital.springboot.user.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserMapper mapper;

    public List<UserVO> selectUser() throws Exception {
        return mapper.selectUser();
    }
}

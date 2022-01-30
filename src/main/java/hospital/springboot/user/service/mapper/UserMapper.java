package hospital.springboot.user.service.mapper;


import hospital.springboot.user.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    List<UserVO> selectUser() throws Exception;
}

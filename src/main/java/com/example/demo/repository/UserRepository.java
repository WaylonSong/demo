package com.example.demo.repository;

/**
 * Created by song on 2017/10/23.
 */

import com.example.demo.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin
//@RepositoryRestResource(path = "people")
public interface UserRepository extends BaseRepository<User, Long>  {
//    @RestResource(path = "names", rel = "names")
    List<User> findByUserName(@Param("userName") String userName);
}
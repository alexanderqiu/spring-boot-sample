package org.springboot.sample.service;

import org.springboot.sample.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author long
 * @date 2016/10/27
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Users> getList(){
        String sql = "SELECT USER_ID,USER_NAME,USER_AGE FROM USERS";
        return (List<Users>) jdbcTemplate.query(sql, new RowMapper<Users>(){

            @Override
            public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
                Users users = new Users();
                users.setUserId(rs.getString("USER_ID"));
                users.setUserName(rs.getString("USER_NAME"));
                users.setUserAge(rs.getString("USER_AGE"));
                return users;
            }

        });
    }
}

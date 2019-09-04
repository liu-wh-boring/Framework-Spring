package chapter07.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Action
{
    @Autowired
    private JdbcTemplate template;

    @Transactional
    public boolean insert(String sql,Object... param)
    {
        int b= template.update(sql,param)  ;
        int a = 1/0;
        return b != 0 ;
    }
}

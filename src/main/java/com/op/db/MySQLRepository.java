package com.op.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MySQLRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List select(String query) {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        for (int i = 0; i < rows.size(); i++) {
            rows.get(i);
        }
        return rows;
    }

    public void insertorupdate(String query) {
        jdbcTemplate.update(query);
    }

}

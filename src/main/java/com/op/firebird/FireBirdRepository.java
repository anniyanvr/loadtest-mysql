package com.op.firebird;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class FireBirdRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Map<String, Object>> select(String query) {
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(query);
        return rows;
    }

    public void insertorupdate(String query) {
        jdbcTemplate.update(query);
    }
}
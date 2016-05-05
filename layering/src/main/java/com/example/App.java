package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner{
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String... arg0) throws Exception {
		String sql = "SELECT :a + :b";
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("a", 100)
				.addValue("b", 200);
		Integer result = jdbcTemplate.queryForObject(sql, param, Integer.class);
		
		System.out.println("result = "+result);
		
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

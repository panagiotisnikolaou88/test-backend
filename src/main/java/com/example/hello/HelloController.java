package com.example.hello;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    private final JdbcTemplate jdbcTemplate;

    public HelloController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Simple form
    @GetMapping("/")
    public String index() {
        return "<h1>Greetings from Spring Boot!!!!!!</h1>" +
               "<form method='post' action='/add'>" +
               "<input type='text' name='name' placeholder='Enter your name'/>" +
               "<button type='submit'>Submit</button>" +
               "</form>";
    }

    // Handle form submission and insert into DB
    @PostMapping("/add")
    public String addName(@RequestParam String name) {
        jdbcTemplate.update("INSERT INTO people (name) VALUES (?)", name);
        return "Saved '" + name + "' to the database!";
    }

    // Optional: list all names
    @GetMapping("/list")
    public List<Map<String, Object>> listNames() {
        return jdbcTemplate.queryForList("SELECT * FROM people");
    }
}
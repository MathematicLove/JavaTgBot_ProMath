package org.promathtelegrambot.admin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@RestController
public class HealthCheck {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/ProMathTgBot";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Ayzek123321";

    @GetMapping("/healthcheck")
    public ResponseEntity<String> checkDbConnection() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT 1")) {

            return ResponseEntity.ok("Всё ок");
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                .body("Ошибка подключения к БД: " + e.getMessage());
        }
    }
}
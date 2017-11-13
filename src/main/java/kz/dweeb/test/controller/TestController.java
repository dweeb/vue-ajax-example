package kz.dweeb.test.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class TestController {

    @GetMapping("/now")
    Test getDate() {
        String now = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S"));
        Test test = new Test();
        test.setNow(now);
        return test;
    }

    @Getter
    @Setter
    static class Test {
        private String now;
    }

}

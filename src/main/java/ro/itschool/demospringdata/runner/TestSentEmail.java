package ro.itschool.demospringdata.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.itschool.demospringdata.service.EmailService;

@Component

public class TestSentEmail implements CommandLineRunner {
    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) throws Exception {
        this.emailService.sendEmail("vivipala37@gmail.com","Test","test","src/main/resources/myfile.txt");

    }
}

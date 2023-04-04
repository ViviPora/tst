package ro.itschool.demospringdata.schedulers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ro.itschool.demospringdata.service.EmailService;

//@Component
public class WeeklyReportScheduler {
    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0 8 * * MON")
    public void sendReport(){

    }
}

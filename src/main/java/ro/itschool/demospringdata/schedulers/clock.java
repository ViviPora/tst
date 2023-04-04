package ro.itschool.demospringdata.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class clock {
    @Scheduled(fixedRate = 1000)
    public void tic(){
        System.out.println("tic");
    }
}

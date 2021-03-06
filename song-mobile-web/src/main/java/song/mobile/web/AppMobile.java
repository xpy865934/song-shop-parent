package song.mobile.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * created on 2019/3/9 14:17
 *
 * @author nfboy_liusong@163.com
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppMobile {

    public static void main(String[] args) {
        SpringApplication.run(AppMobile.class, args);
    }
}

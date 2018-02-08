package cn.alianyi.dailylife.commondao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/dubbo.xml")
public class CommondaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommondaoApplication.class, args);
	}
}

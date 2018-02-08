package cn.alianyi.dailylife.commondao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CommondaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommondaoApplication.class, args);
	}
}

package in.edac;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day16SpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day16SpringBootApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Hello Spring, this is run method");
	}



}

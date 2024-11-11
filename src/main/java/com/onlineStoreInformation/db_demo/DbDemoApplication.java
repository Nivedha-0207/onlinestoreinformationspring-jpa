package com.onlineStoreInformation.db_demo;

import com.onlineStoreInformation.db_demo.Entity.OnlineStoreInformation;
import com.onlineStoreInformation.db_demo.Repository.OnlineStoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner {

	@Autowired
	OnlineStoreInformationRepository onlineStoreInformationRepository;
	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}

	@Override
	public void run(String...args)
	{
		OnlineStoreInformation OnlineStoreInformationOne = new OnlineStoreInformation("Amazon",
				"All types of bags are available here","XXXXXX");
		OnlineStoreInformation OnlineStoreInformationTwo = new OnlineStoreInformation("Flipkart",
				"All types of books are available here","YYYYYY");
		OnlineStoreInformation OnlineStoreInformationThree = new OnlineStoreInformation("Nykaa",
				"All types of beauty products are available here","ZZZZZZ");
		OnlineStoreInformation OnlineStoreInformationFour = new OnlineStoreInformation("Meesho",
				"All types of fashion items are available here","AAAAAA");

		onlineStoreInformationRepository.save(OnlineStoreInformationOne);
		onlineStoreInformationRepository.save(OnlineStoreInformationTwo);
		onlineStoreInformationRepository.save(OnlineStoreInformationThree);
		onlineStoreInformationRepository.save(OnlineStoreInformationFour);

		onlineStoreInformationRepository.findBystoreName("Amazon").forEach(
				val -> System.out.println(val)
		);

		onlineStoreInformationRepository.findBystoreDetails("All types of fashion items are available here").forEach(
				val -> System.out.println(val)
		);

		onlineStoreInformationRepository.findByphoneNumber("YYYYYY").forEach(
				val -> System.out.println(val)
		);
		onlineStoreInformationRepository.findById(3).ifPresent(
				val -> System.out.println(val)
		);


	}
}

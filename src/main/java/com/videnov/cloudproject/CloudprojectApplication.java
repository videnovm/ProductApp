package com.videnov.cloudproject;


import com.videnov.cloudproject.domain.Product;
import com.videnov.cloudproject.property.ApiUrlProperties;
import com.videnov.cloudproject.property.FileStorageProperties;
import com.videnov.cloudproject.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class,
		ApiUrlProperties.class
})
public class CloudprojectApplication{

	public static void main(String[] args) {
		SpringApplication.run(CloudprojectApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository productRepository) {
		return args -> {

			Product product1 = new Product("Xbox 360");
			product1.setPrice(299.00);
			product1.setImage("/images/xbox360.jpg");
			productRepository.save(product1);

			Product product2 = new Product("Wii");
			product2.setPrice(269.00);
			product2.setImage("/images/wii.jpg");
			productRepository.save(product2);

			Product product3 = new Product("Wireless Controller");
			product3.setPrice(19.99);
			product3.setImage("/images/controller.jpg");
			productRepository.save(product3);

		};
	}
}

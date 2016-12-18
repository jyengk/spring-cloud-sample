package com.example;

import java.util.Collection;
import java.util.stream.Stream;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class ReservationServiceApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication2.class, args);
	}
}

@Entity
class Reservation{
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String reservationName;
	
	public Reservation(String reservationName){
		this.reservationName = reservationName;
	}
	
	public Reservation() {
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reservationName=" + reservationName + "]";
	}
}

@RepositoryRestResource
interface ReservationRepository extends JpaRepository<Reservation, Long>{
	
	@RestResource(path = "by-name")
	Collection<Reservation> findByreservationName(@Param("rn") String reservationName);
}

@RefreshScope
@RestController
class MessagerestController{
	
	@Value("${message}")
	private String message;
	
	@RequestMapping("/message")
	String getMessage(){
		return this.message;
	}
}

@Component
class DummyDataCLR implements CommandLineRunner{
	
	@Autowired
	ReservationRepository repository;

	@Override
	public void run(String... arg0) throws Exception {
		Stream.of("Mark", "Lilia", "Nina", "Andrew", "Julia", "Stefan")
				.forEach(a -> repository.save(new Reservation(a)));
		repository.findAll().forEach(System.out::println);
		repository.findByreservationName("Mark").forEach(System.out::println);
	}
	
}

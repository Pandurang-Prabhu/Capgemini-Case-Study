package com.cropdeal.farmerservice;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cropdeal.farmerservice.entity.Farmer;
import com.cropdeal.farmerservice.entity.repo.FarmerRepo;
import com.cropdeal.farmerservice.entity.service.FarmerService;
import org.springframework.test.annotation.Rollback;


@SpringBootTest
class FarmerServiceApplicationTests {

	
	@Autowired
	private FarmerService farmerService;
	
	@MockBean
	private FarmerRepo farmerRepo;

	Farmer farmer = new Farmer(1,"hari","hari@gmail.com","huhu",12356123L);

	@Test
	public void addFarmer() {
		Farmer farmer = new Farmer(1,"hari","hari@gmail.com","huhu",12356123L);
		when(farmerRepo.save(farmer)).thenReturn(farmer);
		assertEquals(farmer, farmerService.addFarmer(farmer));
		}
	
	@Test
	public void getAllFarmer() {
		when(farmerRepo.findAll()).thenReturn(Stream.of(new Farmer(1,"hari","hari@gmail.com","huhu",12356123L),new Farmer(2,"juju","juju@gmail.com","juju",12356123L),new Farmer(3,"fufu","fufu@gmail.com","fufu",12356123L)).collect(Collectors.toList()));
		assertEquals(3 , farmerService.getAllFarmers().size());
	}

	@Test
	public void updateFarmer() {
		Farmer farmer = new Farmer(1,"hari","hari@gmail.com","huhu",12356123L);
		when(farmerRepo.save(farmer)).thenReturn(farmer);
		assertEquals(farmer, farmerService.addFarmer(farmer));
	}

	@Test
	public void update() {
		Farmer farmer =  new Farmer(1,"hari","hari@gmail.com","huhu",12356123L);
		farmerService.upFarmer(farmer);
		verify(farmerRepo,times(1)).save(farmer);
	}

	@Test
	public void delete() {
		Integer farmerid = 23;
		farmerService.deleteFarmerById(farmerid);
		verify(farmerRepo,times(1)).deleteById(farmerid);
	}





}

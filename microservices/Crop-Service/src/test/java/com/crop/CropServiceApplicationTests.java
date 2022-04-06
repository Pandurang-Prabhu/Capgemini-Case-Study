package com.crop;

import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.crop.entity.CropDetails;
import com.crop.repo.CropDetailsRepo;
import com.crop.service.CropService;

@SpringBootTest
class CropServiceApplicationTests {
	
//	@Autowired
//	private CropService cropService;
//	
//	@MockBean
//	private CropDetailsRepo cropDetailsRepo;
//	
	@Test
	void contextLoads() {

	}
//
}

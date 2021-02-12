package com.rakuten.training.web;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.rakuten.training.dal.ProductRepository;
import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductSerivce;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = { ProductController.class })
class ProductControllerUnitTest {
	@MockBean
	ProductSerivce mockService;

	@MockBean
	ProductRepository repo;

	@Autowired
	MockMvc mockMvc;

	@Test
	void testGetProductById() throws Exception {
//		Arrangement
		int id = 1;
		Product dataReturnedByMock = new Product("test", 12345, 2);
		dataReturnedByMock.setId(id);

		Mockito.when(mockService.findById(id)).thenReturn(dataReturnedByMock);
		mockMvc.perform(MockMvcRequestBuilders.get("/products/{id}", id).accept(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk()).andExpect(jsonPath("$.id", CoreMatchers.is(1)));

	}

//	@Test
//	void testGetProductByPrice() throws Exception {
//		int id = 1;
//		float price = 10000;
//		Product dataReturnedByMock = new Product("test", 10000, 2);
//		dataReturnedByMock.setId(id);
//		
//		Mockito.when(repo.findByPrice(price)).thenReturn(dataReturnedByMock);
//		
//		mockMvc.perform(MockMvcRequestBuilders.get("/products/search/{price}", price).accept(MediaType.APPLICATION_JSON))
//		.andExpect(MockMvcResultMatchers.status().isOk());
//	}

}

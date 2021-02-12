//package com.rakuten.training;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.rakuten.training.dal.ProductDAO;
//import com.rakuten.training.dal.ProductDAOInMemImpl;
//import com.rakuten.training.service.ProductSerivce;
//import com.rakuten.training.service.ProductServiceImpl;
//import com.rakuten.training.ui.ProductConsoleUi;
//
//@Configuration
//public class ProductsAppConfiguration {
//	
//	
//	@Bean
//	public ProductDAO daoObj() {
//		ProductDAOInMemImpl dao = new ProductDAOInMemImpl();
//		return dao;
//	}
//	
//	@Bean
//	public ProductSerivce  serviceObj() {
//		ProductServiceImpl service = new ProductServiceImpl();
//		service.setDao(daoObj());
//		return service;
//	}
//	
//	@Bean
//	public ProductConsoleUi uiObj() {
//		ProductConsoleUi ui = new ProductConsoleUi();
//		ui.setService(serviceObj());
//		return ui;
//	}
//	
//	
//	
//}

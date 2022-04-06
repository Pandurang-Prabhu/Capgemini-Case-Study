package com.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


import com.cart.model.CartDetails;


public class modeltest {
	public CartDetails cartDetails = new CartDetails();
	
	
	@Test
    void getId() {
        cartDetails.setId(2);
        assertEquals(2,cartDetails.getId());
    }

    @Test
    void getCropName() {
        cartDetails.setCropName("Apple");
        assertEquals("Apple",cartDetails.getCropName());
    }
    
    @Test
    void getDealername() {
        cartDetails.setDealername("Pandu");
        assertEquals("Pandu",cartDetails.getDealername());
    }



    @Test
    void getCropQuantity() {
        cartDetails.setCropQuantity(2);
        assertEquals(2,cartDetails.getCropQuantity());
    }
    
    @Test
    void getPrice() {
       cartDetails.setPrice(200);
        assertEquals(200,cartDetails.getPrice());
    }
    
    
    @Test
    void construct() {
        CartDetails cartDetails2=new CartDetails(2,"Apple","Pandu",2,200);

    }
    

  

}

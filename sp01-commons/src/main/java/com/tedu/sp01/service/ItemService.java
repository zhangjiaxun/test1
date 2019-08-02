package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.User;

public interface ItemService {
	
	void decreaseNumbers(List<Item> list);
	List<Item> getItems(String orderId);
}

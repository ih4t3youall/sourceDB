package ar.com.sourcesistemas.sourceDB.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProxyService {
	private ObjectMapper objectMapper;
	private Map<String, ArrayList<String>> data;

	public ProxyService() {

		data = new HashMap<String, ArrayList<String>>();
		objectMapper = new ObjectMapper();

	}

	public void addData(String entity, Object object) {

		List<Object> value = data.get(entity);
		if (value.size() == 0) {
			try {
			checkAlreadyExist(object);	
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			
			
			
		}

	}

	private void checkAlreadyExist() {
		// TODO Auto-generated method stub
		
	}

}

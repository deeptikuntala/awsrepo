package com.dk.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.dk.lambda.beans.ProcessBean;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AlertLambda implements RequestHandler<String, String> {
    @Override
    public String handleRequest(String event, Context context) {
    	ObjectMapper mapper = new ObjectMapper();
    	ProcessBean obj = new ProcessBean();

    	obj.setFeedId("1234");
    	//Object to JSON in String
    	String jsonInString =null;
    	try {
			 jsonInString = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return jsonInString;
    }
    
}
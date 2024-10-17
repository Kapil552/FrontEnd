package com.crud.daoimpl;

import java.util.HashMap;
import java.util.Map;

public class Message {

	public static final String INPUT_ERROR = "inputerror";
	public static final String MESSAGE = "message";
	public static final String DATA = "data";

	private Map<String, Object> result = new HashMap<String, Object>();
	
	public Message() {

	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public void addInputError(Object value) {
		result.put(INPUT_ERROR, value);
	}

	public void addMessage(Object value) {

		result.put(MESSAGE, value);
	}

	public void addData(Object value) {
		result.put(DATA, value);
	}

}
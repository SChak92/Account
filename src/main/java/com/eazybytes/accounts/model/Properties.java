package com.eazybytes.accounts.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Properties {
	
	private String msg;
	private String buildVesrion;
	private Map<String, String> mailDetails;
	private List<String> activeBranches;
	
	public Properties(String msg, String buildVesrion, Map<String, String> mailDetails, List<String> activeBranches) {
		this.msg = msg;
		this.buildVesrion = buildVesrion;
		this.mailDetails = mailDetails;
		this.activeBranches = activeBranches;
	}
	
	
}

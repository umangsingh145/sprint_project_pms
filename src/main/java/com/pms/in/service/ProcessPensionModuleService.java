package com.pms.in.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.in.entities.PensionerDetails;
import com.pms.in.repository.ProcessPensionModuleRepository;

@Service
public class ProcessPensionModuleService {
	
	private static final Logger LOG=LoggerFactory.getLogger(ProcessPensionModuleService.class);
	
	@Autowired
	private ProcessPensionModuleRepository processPensionModuleRepository;
	
	private PensionerDetails validateDetails(PensionerDetails pensionerDetails) {
		
		
	}
	
	

}

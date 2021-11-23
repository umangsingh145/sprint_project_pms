package com.pms.in.controller;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pms.in.entities.PensionDetails;
import com.pms.in.entities.Pensioner;
import com.pms.in.service.ProcessPensionModuleService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ProcessPensionModuleController {

	@Autowired
	private ProcessPensionModuleService processPensionModuleService;

	private static final Logger LOG = LoggerFactory.getLogger(ProcessPensionModuleController.class);

	@GetMapping("/PensionDetail")
	// @ApiOperation(value = "Provides the details of the pensioner", notes =
	// "Validates the pensioner details on the basis of aadhaar number", response =
	// Pensioner.class)
	public ResponseEntity<PensionDetails> getPensionDetail(@RequestParam String name,
			@RequestParam int pan, @RequestParam int aadhaar, @RequestParam String type) {

		LOG.info("START");

		processPensionModuleService.validatePensionerDetails(name, pan, aadhaar, type)
			Pensioner updatedPensioner = processPensionserviceDao.calculatePension(token, aadhaar);
			logger.info("END");
			return updatedPensioner;
	}

	@GetMapping("/getempbyid/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int eid) {
		LOG.info("Controller getEmpById");
		Employee emp = empService.getEmployeeById(eid); // line
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This employee is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(emp, headers, HttpStatus.OK);
		return response;
	}
}

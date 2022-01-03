package com.availity.api;

import static com.availity.support.Constants.PATH_VARIABLE_MEMBER_ID;
import static com.availity.support.Constants.REQUEST_MAPPING_AVAILITY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.availity.service.AvailityService;

@RestController
@RequestMapping(REQUEST_MAPPING_AVAILITY)
public class AvailityAPI {
	
	@Autowired
	AvailityService availityService;

	@GetMapping(path = "/eligibility/{memberId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getCustomerDetail(@PathVariable(name = PATH_VARIABLE_MEMBER_ID) Long memberId) {
		return ResponseEntity.ok(availityService.findMemberEligibility(memberId));	
	}

}

package com.availity.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultAvailityService implements AvailityService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DefaultAvailityService.class);

	@Override
	public Object findMemberEligibility(Long memberId) {
		LOGGER.debug("Fetching eligibility for member by id: {}", memberId);
		return null;
	}

}

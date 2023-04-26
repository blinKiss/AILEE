package com.team1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team1.domain.WomanGeneration;
import com.team1.mapper.WomanGenerationMapper;

@Service
public class WomanGenerationServiceImpl implements WomanGenerationService {

	@Autowired
	private WomanGenerationMapper mapper;

	@Override
	public List<WomanGeneration> list() throws Exception {

		return mapper.list();
	}
}

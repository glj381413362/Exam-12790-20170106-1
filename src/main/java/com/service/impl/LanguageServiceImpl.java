package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.LanguageMapper;
import com.model.Language;
import com.service.ILanguageService;
@Component("languageService")
public class LanguageServiceImpl implements ILanguageService {
	@Autowired
	private LanguageMapper languageMapper;


	@Override
	public List<Language> selectListByWhere() {
		return languageMapper.selectLanguageList();
	}


	@Override
	public Language getById(Short id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Language getByEntity(Language entity) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update(Language entity) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int insert(Language entity) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	public void setLanguageMapper(LanguageMapper languageMapper) {
		this.languageMapper = languageMapper;
	}

}

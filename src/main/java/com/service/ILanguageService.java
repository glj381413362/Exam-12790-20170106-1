package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dao.BaseMapper;
import com.model.Language;

public interface ILanguageService extends BaseMapper<Language, Short> {
	
	List<Language> selectListByWhere();
}

package com.dao;

import java.util.List;

import com.model.Language;

public interface LanguageMapper extends BaseMapper<Language, Short>{
	List<Language> selectLanguageList();
}

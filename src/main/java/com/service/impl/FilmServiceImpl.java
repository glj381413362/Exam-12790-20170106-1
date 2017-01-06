package com.service.impl;

import static org.springframework.util.Assert.notNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.FilmMapper;
import com.dao.LanguageMapper;
import com.model.Film;
import com.model.FilmVo;
import com.model.Language;
import com.model.ResponseData;
import com.service.IFilmService;

@Component("filmService")
public class FilmServiceImpl implements IFilmService {
	@Autowired
	private FilmMapper filmapper;

	@Autowired
	private LanguageMapper languageMapper;

	@Override
	public int insertSelectiveService(Film film) {
		notNull(film, "user can not be null");
		return filmapper.insert(film);
	}


	@Override
	public int deleteByPrimaryKeyService(Short filmId) {
		notNull(filmId, "user can not be null");
		return  filmapper.deleteByPrimaryKey(filmId);
	}

	@Override
	public int updateFilmByPrimaryKey(Film film) {
		notNull(film, "film can not be null");
		return filmapper.update(film);
	}

	@Override
	public FilmVo selectByKeyService(Short filmId) {
		notNull(filmId, "user can not be null");
		FilmVo res = filmapper.selectByPrimaryKey(filmId);
		List<Language> selectLanguageList = languageMapper.selectLanguageList();
		res.setLanguages(selectLanguageList);
		return res;
	}
	@Override
	public Film selectByPrimaryKeyService(Short entityKey) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Film selectSingleByWhereService(Film entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> selectListByWhereService(Film entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> findFilmByTitleLike(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseData<Film> query(Film film) {
		notNull(film, "film can not be null");
		ResponseData<Film> responseData = new ResponseData<Film>();
		List<Film> rows = filmapper.findFilmByTitleLike(film);
		responseData.setRows(rows);
		if(film.getFilmId()!=null){
			responseData.setTotal(1);
		}else {
			responseData.setTotal(filmapper.selectCount(film));
		}
		return responseData;
	}
	@Override
	public ResponseData<FilmVo> queryFilmVo(Film film) {
		notNull(film, "film can not be null");
		ResponseData<FilmVo> responseData = new ResponseData<FilmVo>();
		List<FilmVo> rows = filmapper.findFilmVoByTitleLike(film);
		responseData.setRows(rows);
		if(film.getFilmId()!=null){
			responseData.setTotal(1);
		}else {
			responseData.setTotal(filmapper.selectCount(film));
		}
		return responseData;
	}

	public void setFilmapper(FilmMapper filmapper) {
		this.filmapper = filmapper;
	}

	public LanguageMapper getLanguageMapper() {
		return languageMapper;
	}

	public void setLanguageMapper(LanguageMapper languageMapper) {
		this.languageMapper = languageMapper;
	}

	public FilmMapper getFilmapper() {
		return filmapper;
	}

	
	

	

}

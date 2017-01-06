package com.service;

import java.util.List;

import com.model.Film;
import com.model.FilmVo;
import com.model.ResponseData;

public interface IFilmService extends IBaseService<Film, Short>{

	public List<Film> findFilmByTitleLike(String name);
	
	ResponseData<Film> query(Film film);
	
	ResponseData<FilmVo> queryFilmVo(Film film);
	
	FilmVo selectByKeyService(Short filmId);
}

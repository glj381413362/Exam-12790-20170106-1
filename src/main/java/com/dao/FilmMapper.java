package com.dao;

import java.util.List;

import com.model.Film;
import com.model.FilmVo;

public interface FilmMapper extends BaseMapper<Film, Short> {
	
	int selectCount(Film film);
	
	FilmVo selectByPrimaryKey(Short filmId);
	
	List<Film> findFilmByTitleLike(Film film);
	
	List<FilmVo> findFilmVoByTitleLike(Film film);
	
}

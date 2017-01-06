package com.dao;

import java.util.List;

import com.model.Film;
import com.model.FilmVo;

public interface FilmMapper extends BaseMapper<Film, Short> {
	
	int selectCount(Film film);
	
	
	
	FilmVo selectByPrimaryKey(Short filmId);
	
	List<Film> findFilmByTitleLike(Film film);
	
	List<FilmVo> findFilmVoByTitleLike(Film film);
	
	
	/*int insert(Film record);	
	int insertSelective(Film record);
	int deleteByPrimaryKey(@Param("filmId") Short filmId);
	int updateByPrimaryKeySelective(Film record);
	int updateByPrimaryKey(Film record);
	int selectCountByWhere(Film Entity);
	Film selectByPrimaryKey(@Param("filmId") Short filmId);
	Film selectSingleByWhere(Film Entity);
	List<Film> selectListByWhere(Film Entity);
	List<Film> findFilmByTitleLike(Film Entity);*/
}

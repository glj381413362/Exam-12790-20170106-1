package com.constroller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Film;
import com.model.FilmVo;
import com.model.Language;
import com.model.ResponseData;
import com.service.IFilmService;
import com.service.ILanguageService;

@Controller
@RequestMapping("/film")
public class FilmController {
	@Autowired
	private IFilmService filmService;

	@Autowired
	private ILanguageService languageService;

	@RequestMapping("queryFilm")
	public @ResponseBody ResponseData<FilmVo> queryFilm(
			@RequestParam(name = "filmId", required = false, defaultValue = "0") int filmId,
			@RequestParam(name = "filmTitle", required = false, defaultValue = "") String filmTitle,
			@RequestParam(name = "page", required = false, defaultValue = "1") int page,
			@RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
		System.out.println(page+"  "+pageSize);
		Film film = new Film();
		if (filmId != 0) {
			film.setFilmId((short) filmId);
		} else {
			film.setTitle(filmTitle);
		}
		film.setLimitStart(page);
		film.setLimitEnd(pageSize);
		ResponseData<FilmVo> query = filmService.queryFilmVo(film);
		return query;
	}

	@RequestMapping("deleteFilm")
	public @ResponseBody String deleteFilm(@Param("filmId") int filmId) {
		int res = filmService.deleteByPrimaryKeyService((short) filmId);
		return "success";
	}

	@RequestMapping("updateFilm")
	public String updateFilm(@Param("filmId") int filmId) {
		return "redirect:../updateFilm.html?filmId=" + filmId;
	}

	@RequestMapping("updateFilmAjax")
	public @ResponseBody FilmVo updateFilmAjax(@Param("filmId") int filmId) {
		FilmVo filmVo = filmService.selectByKeyService((short) filmId);
		return filmVo;
	}

	@RequestMapping(value = "updateFilmSave")
	public String updateFilmSave(FilmVo filmVo, @Param("langId") int langId) {
		filmVo.getFilm().setLanguageId(langId);
		filmService.updateFilmByPrimaryKey(filmVo.getFilm());
		return "redirect:../index.html";
	}

	@RequestMapping("addFilmAjax")
	public @ResponseBody FilmVo addFilmAjax() {
		List<Language> languageList = languageService.selectListByWhere();
		FilmVo filmVo = new FilmVo();
		filmVo.setLanguages(languageList);
		return filmVo;
	}

	@RequestMapping("addFilmSave")
	public String addFilmSave(FilmVo filmVo) {
		filmService.insertSelectiveService(filmVo.getFilm());
		return "redirect:../index.html";
	}

	public void setFilmService(IFilmService filmService) {
		this.filmService = filmService;
	}

	public void setLanguageService(ILanguageService languageService) {
		this.languageService = languageService;
	}
}

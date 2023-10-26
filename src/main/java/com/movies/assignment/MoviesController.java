package com.movies.assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@Autowired
	private MovieService movieService;

	@RequestMapping("/movies")
	public List<Movie> getmovies() {
		return movieService.getMovies();
	

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/movies")
	public void addMovie(@RequestBody Movie movie) {
		movieService.addMovie(movie);
	}
	
	@RequestMapping("/movies/{id}")
	public Optional<Movie> getMovie(@PathVariable String id){
		System.out.println("Inside getCompany");
		return movieService.getMovie(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/movies/{id}")
	public void updateMovie(@RequestBody Movie movie, @PathVariable String id) {
		System.out.println("inside updateMovie");
		movieService.updateMovie(id, movie);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
	public void deleteMovie(@PathVariable String id){
		System.out.println("Inside deleteMovie");
		movieService.deleteMovie(id);
	}
	

}

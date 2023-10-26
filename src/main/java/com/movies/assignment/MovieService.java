package com.movies.assignment;




import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieService {
	
	@Autowired
	private MovieDAORepository movieDAORepository;
	
	public List<Movie> getMovies(){
		List<Movie> movieList = new ArrayList<Movie>();
		movieDAORepository.findAll().forEach(movieList::add);
		return movieList;
		
	}
	
	public Optional<Movie> getMovie(String id) {
		return movieDAORepository.findById(id);
	}
	
	public void updateMovie(String id, Movie movie) {
		movieDAORepository.save(movie);
	}

	public void deleteMovie(String id) {
		movieDAORepository.deleteById(id);
	}

	
	public void addMovie(Movie movie) {
		movieDAORepository.save(movie);
	}

}

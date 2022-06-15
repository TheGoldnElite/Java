package com.codingdojo.services;


@Service
public class MovieService {
	
	private MovieRepository movieRespository;
	
	
	
	
	@Autowired
	private MovieRepository movieRespository;
//	or do this step. either one does the same;
//	public MovieService(MovieRepository movieRespository) {
//		this.movieRepository=movieRepository;
//	}
	

	//insert into movie() value();
 	public void create(Movie movie) {
		movieRepository.save(movie);
	}
	
	//update table movie (afds,fdsafsd,fdsa) values(fjadsfds,fdsa,fdsa) where movie.id=movie.getId()
	public void update(Movie movie) {
		movieRepository.save(movie);
	}
	
	
	// select * From movie;
	//all movies
	public ArrayList<Movie> finalAll(){
		
		
		return (ArrayList<Movie>) movieRepository.findAll();
	}
	
	//find one
	//select * from movie where movie.id=?;
	public Movie findOne(Long id) {
		Optional<Movie> movie=movieRepository.findById(id);
		return movie.isPresent()?movie.get():null;
	}
	
	
	
	public void deleteOne(Long id) {
		movieRepository.deleteById(id);
	}
	
	

};

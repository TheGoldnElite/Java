package com.codingdojo;

@Controller
@RequestMapping("/movie")
public class RootController {
	
	
	@Autowired
	private MovieServices movieService;
	
//	or
//	private MovieService movieService;
//
//	public RootController(MovieService movieService) {
//		
//		this.movieService=movieService;
//	}
	
	
	@GetMapping("")
		public String index(Model model) {
			
			System.out.println("Create")
			model.addAttribute("movie", new Movie());
			model.addAttribute("movies", movieService.findAll());
			return "index";
		}
	
	@PostMapping("/")
		public String createMovie(@Valid @ModelAttribute("movie") Movie movie,BindingResult res) {
			
			if(res.hasErrors()) {
				return "index";
			}
			movieService.create(movie);
			return "redirect:/movie";
	}
	
		
	@GetMapping("/show/{id}")
		public String show( @PathVariable("id") LongId) {
			return "show";
	}
	
	@GetMapping("/edit/{id}")
		public String edit(@PathVariable("id") Long movieId, Model model) {
			
			model.addAttribute("movie",movieService.findOne(movieId));
			return "edit";
	}
	
	@PostMapping("/delete/{id}")
	public String deleteMovie ( @PathVariable("id") Long movieId) {
		movieService.deleteOne(movieId);
		return "redirect:/movie";
	}
	
	@PostMapping("/edit/{id}")
		public String update (@Valid @ModelAttribute("movie") Movie movie,BindingResult res) {
			if(res.hasErrors()) {
				return "edit";
			}
			movieService.update(movie);
			return "redirect:/movie";
	}
	
	
};

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
			
			model.addAttribute("movie", new Movie());
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
		public String show() {
			return "show";
	}
	
	@GetMapping("/edot/{id}")
		public String edit() {
			return "edit";
	}
	
	
}

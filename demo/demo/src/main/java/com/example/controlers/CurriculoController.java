@RestController
@RequestMapping("/api/curriculos")

public class CurriculoController {

    @Autowired
    private CurriculoRepository curriculoRepository;

    @GetMapping
    public List<Curriculo> getAllCurriculos() {
        return curriculoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> getCurriculoById(@PathVariable Long id) {
        Optional<Curriculo> curriculo = curriculoRepository.findById(id);
        return curriculo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Curriculo createCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoRepository.save(curriculo);
    }

    // Implemente outros métodos CRUD conforme necessário
}

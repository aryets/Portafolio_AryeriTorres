package TechShop.AryeriTorres.service;

import TechShop.AryeriTorres.domain.Categoria;
import TechShop.AryeriTorres.repository.CategoriaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    // Inyección de dependencias vía constructor
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }
    
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activo) {
        if (activo) {
            // Devuelve solo las categorías activas
            return categoriaRepository.findByActivoTrue();
        } else {
            // Devuelve todas las categorías
            return categoriaRepository.findAll();
        }
    }
}
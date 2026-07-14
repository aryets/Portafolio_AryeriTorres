package TechShop.AryeriTorres.repository;

import TechShop.AryeriTorres.domain.Ruta;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutaRepository extends JpaRepository<Ruta, Integer> {
    public List<Ruta> findAllByOrderByRequiereRolAsc();
    
}

package tacos.data;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import tacos.Ingredient;

@Repository
@CrossOrigin(origins = "*")
public interface IngredientRepository extends ReactiveCrudRepository<Ingredient, String> {

}
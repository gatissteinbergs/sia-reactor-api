package tacos.data;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import tacos.Taco;

@Repository
public interface TacoRepository extends ReactiveMongoRepository<Taco, String> {

    Flux<Taco> findByOrderByCreatedAtDesc();
}

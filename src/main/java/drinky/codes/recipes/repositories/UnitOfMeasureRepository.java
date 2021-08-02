package drinky.codes.recipes.repositories;

import drinky.codes.recipes.domain.Category;
import drinky.codes.recipes.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}

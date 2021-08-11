package drinky.codes.recipes.repositories;

import drinky.codes.recipes.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UnitOfMeasureRepositoryIT {

//    UnitOfMeasureRepository unitOfMeasureRepository;
//
//    @Before
//    void setUp() throws Exception {
//
//    }
//
//    @Test
//    void findByDescription() throws Exception {
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        assertEquals("Teaspoonsss", unitOfMeasureOptional.get().getDescription());
//    }
}
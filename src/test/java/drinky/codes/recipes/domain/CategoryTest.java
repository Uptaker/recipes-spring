package drinky.codes.recipes.domain;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
//import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

//    Category category;
    Category category = new Category();

//    @Before
//    public void setUp() {
//        category = new Category();
//    }

    @Test
    void getId() {
        Long idValue = 4l;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}
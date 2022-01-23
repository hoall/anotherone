package de.felixpaetow.anotherone;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class AnotheroneApplicationTests {

    @Autowired
    private FatsecretService service;

    @Test
    void contextLoads() {
    }

    @Test
    void FatsecretServiceWorks() {
        String query = "pasta"; //Your query string
        Response<CompactFood> response = service.searchFoods(query);
        assertNotNull(response);
    }

}

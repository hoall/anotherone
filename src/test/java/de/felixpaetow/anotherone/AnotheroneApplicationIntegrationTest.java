package de.felixpaetow.anotherone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class AnotheroneApplicationIntegrationTest {

    public static final String basePath = "/consumer";

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }


    /*
    Test requires that you have a valid application.yaml configuration.
     */
    @Test
    void searchForPastaShouldReturnACompactFood() throws Exception {
        mockMvc.perform(get("/consumer/search?foodName=pasta"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}

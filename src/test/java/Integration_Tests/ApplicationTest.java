
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApplicationTest {

    @Autowired
    private MockMvc mockMvc;

	
	@Test
    public void shouldReturnDefaultMessage() throws Exception {
        ResultActions getRequestResult = mockMvc.perform(get("/"));
        ResultActions response = getRequestResult.andDo(print());
        response.andExpect(status().isOk())
                .andExpect(content().string(containsString("Review")));
        
	}

}

package com.itheima;


import com.itheima.pojo.BookTest;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureMockMvc
public class WebTest {
    /**
     * 测试不会启动Tomcat
     */

    @Autowired
    MockMvc mockMvc;

    @SneakyThrows
    @Test
    void web() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        mockMvc.perform(builder);
    }

    @SneakyThrows
    @Test
    void status() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);

        StatusResultMatchers status = MockMvcResultMatchers.status();
        ResultMatcher ok = status.isNotFound();

        perform.andExpect(ok);

    }

    @SneakyThrows
    @Test
    void body() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);

        ContentResultMatchers content = MockMvcResultMatchers.content();

        ResultMatcher get = content.string("get");

        perform.andExpect(get);
    }

    @SneakyThrows
    @Test
    void json() {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);
        ContentResultMatchers content = MockMvcResultMatchers.content();


        ResultMatcher get = content.json("{\"id\":1}");

        perform.andExpect(get);
    }

    @Test
    public void testContentType(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        HeaderResultMatchers header = MockMvcResultMatchers.header();
        ResultMatcher resultHeader = header.string("Content-Type", "application/json");


        action.andExpect(resultHeader);
    }

    @Autowired
    private BookTest book;

    @Test
    void random(){
        System.out.println("book = " + book);
    }
}


package com.springinaction.web.spittr.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**HomeController 测试类
 * @author DW
 * @version 1.0
 * @date 2021/5/12 21:29
 **/
public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception{
        HomeController controller = new HomeController();
        //assertEquals("home",controller.home());
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }
}

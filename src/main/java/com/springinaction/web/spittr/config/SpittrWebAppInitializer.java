package com.springinaction.web.spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**DispatcherServlet
 是Spring MVC的核心。在这里请求会第一次接触到框架，它要负责将请求路由到其他的组件之中。
 * 扩展AbstractAnnotation-ConfigDispatcherServletInitializer
 *的任意类都会自动地配置Dispatcher-Servlet
 *和Spring应用上下文，Spring的应用上下文会位于应用程序的Servlet上下文之中。
 * @author DW
 * @version 1.0
 * @date 2021/5/11 21:30
 **/
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * 将DispatcherServlet映射到"/”
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    /**
     * 返回的带有@Configuration
     *注解的类将会用来配置ContextLoaderListener
     *创建的应用上下文中的bean。
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    /**
     * 指定配置类
     * 返回的带有@Configuration
     *注解的类将会用来定义DispatcherServlet
     *应用上下文中的bean。
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }
}

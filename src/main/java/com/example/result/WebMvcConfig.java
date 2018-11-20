//package com.example.result;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//
///**
// * Created by timxia on 2017/4/4.
// * 这里不能和application.yml 中的配置冲突，两个地方配置一个即可
// *
// * 当使用第三种方式指定返回数据格式的时候这个配置不需要，直接干掉
// */
//
//@Configuration
//public class WebMvcConfig extends WebMvcConfigurationSupport {
//
//    @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//        configurer.favorPathExtension(true)
//                .favorParameter(true)
//                .parameterName("format")
//        .defaultContentType(MediaType.APPLICATION_ATOM_XML);
//    }
//}

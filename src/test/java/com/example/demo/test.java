package com.example.demo;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by huang on 2017/11/14.
 */
public class test {
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //获取所有匹配的文件
        Resource[] resources = resolver.getResources("/fonts/*.gc");
        for (Resource resource : resources) {
            //获得文件流，因为在jar文件中，不能直接通过文件资源路径拿到文件，但是可以在jar包中拿到文件流
            InputStream stream = resource.getInputStream();

            System.out.println(resource.getURI());
            System.out.println("读取的文件流  [" + stream + "]");
        }

    }
}

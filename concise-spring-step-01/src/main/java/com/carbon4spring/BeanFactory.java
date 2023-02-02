package com.carbon4spring;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @className: BeanFactory
 * @author: CarbonAnimal
 * @date: Created in 2023/2/2 11:20
 * @version: V1.0
 * @description :
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}

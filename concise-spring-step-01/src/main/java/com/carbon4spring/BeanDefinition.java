package com.carbon4spring;

/**
 * @className: BeanDefinition
 * @author: CarbonAnimal
 * @date: Created in 2023/2/2 11:20
 * @version: V1.0
 * @description :
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}

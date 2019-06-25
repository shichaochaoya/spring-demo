package com.imooc.ioc.demo7;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bean2")
@Scope("prototype")//bean作用范围，默认单例
public class Bean2 {

}

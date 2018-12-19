package com.xq.annotationBean;

import org.springframework.stereotype.Component;

/**
 * Package: com.xq.bean
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/12/19
 * Time: 9:45
 * Description:
 */
@Component
public class Student {

    public Student() {
        System.out.println("spring容器调用Student类的无参构造器");
    }
}

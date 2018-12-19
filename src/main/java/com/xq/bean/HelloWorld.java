package com.xq.bean;

/**
 * Package: com.xq
 * User: 段小秋
 * Email: duanxiaoqiu@jd.com
 * Date: 2018/12/19
 * Time: 9:33
 * Description:
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println(this.name);
    }
}

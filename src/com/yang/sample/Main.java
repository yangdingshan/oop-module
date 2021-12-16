package com.yang.sample;

import javax.xml.XMLConstants;

/**
 * @Author: yangdingshan
 * @Date: 2021/12/16 15:21
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Greeting g = new Greeting();
        System.out.println(g.hello(XMLConstants.XML_NS_PREFIX));
    }
}

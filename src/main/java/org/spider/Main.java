package org.example;

import org.jsoup.Jsoup;
import org.jsoup.Connection;

import java.io.IOException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    static String url = "http://cs.whu.edu.cn/teacher.aspx?showtype=jobtitle&typename=%e6%95%99%e6%8e%88";
    static String path = "E://Program//Java_work//Spider//out/";
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println(title);
        Elements w1 = doc.getElementsByClass("w1");
        System.out.println(w1.text());
        Elements w2 = doc.getElementsByClass("w2");
        System.out.println(w2.text());
        Elements w3 = doc.getElementsByClass("w3");
        System.out.println(w3.text());
        Elements w4 = doc.getElementsByClass("w4");
        System.out.println(w4.text());
        Elements w5 = doc.getElementsByClass("w5");
        System.out.println(w5.text());
    }
}
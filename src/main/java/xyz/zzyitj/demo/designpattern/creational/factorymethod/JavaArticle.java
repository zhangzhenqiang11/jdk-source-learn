package xyz.zzyitj.demo.designpattern.creational.factorymethod;

/**
 * xyz.zzyitj.demo.designpattern.creational.factorymethod
 *
 * @author intent zzy.main@gmail.com
 * @date 2020/6/3 8:02 下午
 * @since 1.0
 */
public class JavaArticle extends Article {
    @Override
    void produce() {
        System.out.println("编写Java手记");
    }
}

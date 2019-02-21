package com.java.design.pattern.pattern.BuilderPattern;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public interface Builder {
    /**
     * 打基础
     */
    public void buildBasic();

    /**
     * 砌墙
     */
    public void buildWalls();

    /**
     * 封顶
     */
    public void roofed();

    /**
     * 造房子
     *
     * @return
     */
    public Product buildProduct();
}

package com.java.design.pattern.pattern.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sky
 * create 2019/02/21
 * email sky.li@ixiaoshuidi.com
 **/
public class DeepPerson {
    private String name;
    private String sex;
    private List<String> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }


    @Override
    protected DeepPerson clone() {
        try {
            DeepPerson person = (DeepPerson) super.clone();
            List<String> newList = new ArrayList();
            for (String str : this.list) {
                newList.add(str);
            }
            person.setList(newList);
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}


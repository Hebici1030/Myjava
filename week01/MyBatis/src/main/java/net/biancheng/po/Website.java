package net.biancheng.po;

import javax.xml.crypto.Data;

public class Website {
    private  int id;
    private String name;
    private String url;
    private int age;
    private String country;

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    private Data createtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Data getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Data createtime) {
        this.createtime = createtime;
    }
}

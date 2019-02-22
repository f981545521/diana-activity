package cn.acyou.diana.activity.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author youfang
 * @version [1.0.0, 2019-02-22 下午 01:55]
 * @since [天天健身/商品模块]
 **/
public class Student implements Serializable {

    private static final long serialVersionUID = 5350645545628778721L;

    private Integer id;

    private String name;

    private Integer age;

    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", birth=").append(birth);
        sb.append('}');
        return sb.toString();
    }
}

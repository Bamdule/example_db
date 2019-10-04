package com.bamdule.example.model.VO;

/**
 *
 * @author MW
 */
public class MemberVO {

    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "MemberVO{" + "id=" + id + ", name=" + name + '}';
    }

}

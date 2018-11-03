package com.sgr.meijia.bean;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Title implements Serializable {
    private static final long serialVersionUID = -4733853550185294752L;//ctrl+shift+i 自动生成  Redis会用到
    @Id
    @GeneratedValue     //自增id
    private Integer title_id;

    /**
     * 名称
     */
    private  String name;

    public Title(String name) {
        this.name = name;
    }
    public Title() {

    }

    public Integer getTitle_id() {
        return title_id;
    }

    public void setTitle_id(Integer title_id) {
        this.title_id = title_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

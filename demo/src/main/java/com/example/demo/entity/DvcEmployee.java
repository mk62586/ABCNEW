package com.example.demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
public class DvcEmployee {
    @Id
    @GenericGenerator(name = "abc1",strategy = "increment")
    @GeneratedValue(generator = "abc1")
    private long id;
    private String empCode;
    private String fName;
    private String mName;
    private String iName;
    private java.sql.Date date;
    private String gender;
    private long phoneNo;
    @OneToMany(targetEntity = DvcAdress.class, cascade = CascadeType.ALL)
    private List<DvcAdress> dvcAdressList;
}

package com.example.demo.model;

import com.cputech.modules.usermsg.model.SysUser;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by song on 2017/10/30.
 */
@Entity
@Data
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @ManyToOne
//    @JoinColumn(referencedColumnName="username", name="username")
    SysUser owner;
    String description;
}

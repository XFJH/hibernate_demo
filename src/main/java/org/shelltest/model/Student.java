package org.shelltest.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @version v1.0
 * @create 2020-01-12
 * @author <a href="mail to: i@new-be.com" rel="nofollow">Nash.CC</a>
 * @update [序号][更改日期YYYY-MM-DD] [更改人姓名][变更描述]
 **/
@Data
@Entity
@Table(name = "student")
public class Student {
	private Long id;
	private String name;
	private Integer age;
}

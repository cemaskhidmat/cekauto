package com.services.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="t1024")
public class t1024 {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String c1002;
	private String c1003;
	private String c1004;
	private String c1005;	
	private String c1006;
	private String c1007;
	private String c1008;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getC1002() {
		return c1002;
	}
	public void setC1002(String c1002) {
		this.c1002 = c1002;
	}
	public String getC1003() {
		return c1003;
	}
	public void setC1003(String c1003) {
		this.c1003 = c1003;
	}
	public String getC1004() {
		return c1004;
	}
	public void setC1004(String c1004) {
		this.c1004 = c1004;
	}
	public String getC1005() {
		return c1005;
	}
	public void setC1005(String c1005) {
		this.c1005 = c1005;
	}
	public String getC1006() {
		return c1006;
	}
	public void setC1006(String c1006) {
		this.c1006 = c1006;
	}
	public String getC1007() {
		return c1007;
	}
	public void setC1007(String c1007) {
		this.c1007 = c1007;
	}
	public String getC1008() {
		return c1008;
	}
	public void setC1008(String c1008) {
		this.c1008 = c1008;
	}
	
	

}

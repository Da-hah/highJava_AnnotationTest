package kr.or.ddit.ref;

import java.io.Serializable;

import kr.or.ddit.basic.PrintAnnotation;

public class SampleVo implements Serializable{
	private String id;
	protected String name;
	public int age;
	
	public SampleVo(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public SampleVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@PrintAnnotation
	public void setName(String name) throws Exception{
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "SampleVo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}

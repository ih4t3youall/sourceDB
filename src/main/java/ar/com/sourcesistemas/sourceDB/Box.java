package ar.com.sourcesistemas.sourceDB;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
	public String name;
	public List<T> list;

	public Box() {
		list = new ArrayList<>();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(T e) {
		list.add(e);

	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

}

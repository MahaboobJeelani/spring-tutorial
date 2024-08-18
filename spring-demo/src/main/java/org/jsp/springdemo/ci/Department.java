package org.jsp.springdemo.ci;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Department {

	private List<String> Names;
	private Set<Integer> Ids;
	private Map<Integer, String> Details;

	public List<String> getNames() {
		return Names;
	}

	public void setNames(List<String> names) {
		Names = names;
	}

	public Set<Integer> getIds() {
		return Ids;
	}

	public void setIds(Set<Integer> ids) {
		Ids = ids;
	}

	public Map<Integer, String> getDetails() {
		return Details;
	}

	public void setDetails(Map<Integer, String> details) {
		Details = details;
	}
}

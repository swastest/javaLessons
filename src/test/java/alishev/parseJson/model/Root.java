package alishev.parseJson.model;

import java.util.List;

import lombok.Data;

@Data
public class Root {
	private String name;
	private List<PeopleItem> people;
}
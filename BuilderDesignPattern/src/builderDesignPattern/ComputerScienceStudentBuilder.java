package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerScienceStudentBuilder extends StudentBuilder { 

	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<>();
		subs.add("Computer Networks");
		subs.add("Theory of Computation");
		subs.add("Distributed Systems");
		this.subjects = subs;
		return this;
	}

}

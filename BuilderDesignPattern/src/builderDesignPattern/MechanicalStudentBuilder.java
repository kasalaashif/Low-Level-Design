package builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MechanicalStudentBuilder extends StudentBuilder {
	
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<>(); 
		subs.add("Thermodynamics");
		subs.add("Manufacturing");
		subs.add("Mechanics");
		this.subjects = subs;
		return this;
	}

}

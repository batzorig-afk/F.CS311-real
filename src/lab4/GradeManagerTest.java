package lab4;


import org.junit.Test;

import org.junit.Assert;

public class GradeManagerTest {

	@Test public void makeHashMap() throws Exception {
		GradeManager g = new GradeManager();
		
		Assert.assertNotNull(g);
	}
	@Test public void addValue() throws Exception {
		GradeManager g = new GradeManager();
		g.addGrade("A");
		
		Assert.assertNotNull(g);
	}
	@Test public void throwException() throws Exception {
		GradeManager g = new GradeManager();
		
		Assert.assertNotNull(g);
	}
}

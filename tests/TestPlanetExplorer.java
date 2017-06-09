import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_executeCommand() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void test_rotate_right(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		
		assertEquals("Error", "(0,0,e)", pe.executeCommand("r"));
	}
	
	@Test
	public void test_rotate_left(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		
		assertEquals("Error", "(0,0,w)", pe.executeCommand("l"));
	}
	
	@Test
	public void test_forth_north(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		
		assertEquals("Error", "(0,1,n)", pe.executeCommand("f"));
	}
}

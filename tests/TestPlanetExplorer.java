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
	
	@Test
	public void test_back_north(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("f");
		
		assertEquals("Error", "(0,0,n)", pe.executeCommand("b"));
	}
	
	@Test
	public void test_forth_east(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("r");
		
		assertEquals("Error", "(1,0,e)", pe.executeCommand("f"));
	}
	
	@Test
	public void test_back_east(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("r");
		pe.executeCommand("f");
		
		assertEquals("Error", "(0,0,e)", pe.executeCommand("b"));
	}
	
	@Test
	public void test_forth_south(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("f");
		pe.executeCommand("rr");
		
		assertEquals("Error", "(0,0,s)", pe.executeCommand("f"));
	}
	
	@Test
	public void test_back_south(){
		PlanetExplorer pe = new PlanetExplorer(3, 3, null);
		pe.executeCommand("rr");
		
		assertEquals("Error", "(0,1,s)", pe.executeCommand("b"));
	}

}


// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	private int x = 0;
	private int y = 0;
	private String obstacles;
	private String direction = "n";
	private int roverX = 0;
	private int roverY = 0;

	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
	
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		char[] niz = command.toCharArray();
		for (char i : niz){
			switch(i){
				case 'r': rotate(i); break; 
				case 'l': rotate(i); break;
				case 'f': moveForth(); break;
				case 'b': moveBack(); break;
			}
		}
		
		
		return "(" + roverX + "," + roverY + "," + direction + ")";
	}
	
	public void rotate(char i){
		switch(i){
			case 'r': 
				if (direction.equals("n"))
					direction = "e";
				else if (direction.equals("e"))
					direction = "s";
				else if (direction.equals("s"))
					direction = "w";
				else 
					direction = "n";
				break;
			case 'l':
				if (direction.equals("n"))
					direction = "w";
				else if (direction.equals("w"))
					direction = "s";
				else if (direction.equals("s"))
					direction = "e";
				else 
					direction = "n";
				break;
		}
	}
	
	public void moveForth(){
		switch(direction){
			case "n": 
				if (roverY == y - 1)
					roverY = 0;
				else
					roverY++; 
				break;
			case "e": 
				if (roverX == x - 1)
					roverX = 0;
				else
					roverX++; 
				break;
			case "s": 
				if (roverY == 0)
					roverY = y - 1;
				else
					roverY--; 
				break;
			case "w": 
				if (roverX == 0)
					roverX = x - 1;
				else
					roverX--; break;
		}
	}
	
	public void moveBack(){
		switch(direction){
		case "n": 
			if (roverY == 0)
				roverY = y - 1;
			else
				roverY--; 
			break;
		case "e": 
			if (roverX == 0)
				roverX = x - 1;
			else
				roverX--; 
			break;
		case "s": 
			if (roverY == y - 1)
				roverY = 0;
			else
				roverY++; break;
		case "w": 
			if (roverX == x - 1)
				roverX = 0;
			else
				roverX++; 
			break;
	}
}
}

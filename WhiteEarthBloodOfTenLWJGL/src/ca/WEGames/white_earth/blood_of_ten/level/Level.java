/**
 * 
 */
package ca.WEGames.white_earth.blood_of_ten.level;

import java.util.Random;

/**
 * @author Catman3304
 *
 */
public class Level {
	
	Random random = new Random();
	
	public int x, y, z;
	public int[][] map;
	
	/**
	 * 
	 */
	public Level(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		map = new int[x * z][y];
		genMap();
	}
	
	void genMap() {
		System.out.println("Generating..");
		for(int y = 0; y < this.y; y++) {
			for(int x = 0; x < this.x; x++) {
				for(int z = 0; z < this.z; z++) {
					map[x + z * this.x][y] = random.nextInt(10);
				}
			}
		}
		System.out.println("Finished Generating.");
	}
	
	public int getTile(int x, int y, int z) {
		return map[x + z * this.x][y];
	}
}

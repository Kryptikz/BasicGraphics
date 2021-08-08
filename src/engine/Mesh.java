package engine;
import java.util.*;
public class Mesh {
	
	private ArrayList<Polygon> polygons;
	public Mesh(ArrayList<Polygon> polygons) {
		if(polygons == null) {
			this.polygons = new ArrayList<Polygon>();
		}
		else {
			this.polygons = polygons;
		}
	}
	
	public void addToMesh(Polygon p) {
		polygons.add(p);
	}
	
	public ArrayList<Polygon> getPolygons(){
		return polygons;
	}
}

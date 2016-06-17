package map.generic;

import java.awt.Point;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class PointMap1 {
	public static void main(String[] args) {
		Map<String, Point> myPoints = new HashMap<String, Point>();
		myPoints.put("BUBU", new Point(1,1));
		// 1. einen Iterator auf das keySet erzeugen
		Iterator<Entry<String,Point>> it = myPoints.entrySet().iterator();
		// 2. Keys durchgehen und Elemente aus der Map holen
		while (it.hasNext()) {
			Entry<String,Point> aEntry = it.next();
			Point b = aEntry.getValue();
			System.out.println("Key: " + aEntry.getKey() + " Value: " + b);
		}
	}
}

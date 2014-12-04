package analytics;

import java.util.Comparator;
import java.util.Map;
import entities.TeamInterface;

class ValueComparator implements Comparator<Double> {

	Map<TeamInterface, Double> base;
	public ValueComparator(Map<TeamInterface, Double> predictions) {
		this.base = predictions;
	}

	public int compare(Double a, Double b) {
		if (base.get(a) >= base.get(b)) {
			return -1;
		} else {
			return 1;
		}
	}
}

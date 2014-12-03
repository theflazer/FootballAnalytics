package analytics;

import java.util.Comparator;
import java.util.Map;
import entities.Team;

class ValueComparator implements Comparator<Double> {

	Map<Team, Double> base;
	public ValueComparator(Map<Team, Double> predictions) {
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

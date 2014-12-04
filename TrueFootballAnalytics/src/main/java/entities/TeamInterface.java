package entities;

public interface TeamInterface {

	public String getName();

	public void update(double homePossesion, int homeGoals, int awayGoals);

	public void updatePDO(double pDO);

	public void updateTSR(double tSR);

	public double getTSR();

	public void setTSR(double d);

	public double getPDO();

	public void setPDO(double d);

	public void setIndicative(double d);

}

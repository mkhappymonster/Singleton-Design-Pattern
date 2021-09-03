package SDP;

public class sDP_cl {
	int count = 0;
	private static sDP_cl instance = null;

	private sDP_cl() {

	}

	public void addOne() {
		count++;
	}

	public static sDP_cl getInstance() {
		if (instance == null) {
			instance = new sDP_cl();
		}
		return instance;
	}

}

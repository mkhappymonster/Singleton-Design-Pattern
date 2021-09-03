package SDP;

public class SDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sDP_cl sdp1 = sDP_cl.getInstance();
		sDP_cl sdp2 = sDP_cl.getInstance();
		sdp1.addOne();
		System.out.println("Counter 1: " + sdp1.count);
		System.out.println("Counter 2: " + sdp2.count);
		sdp2.addOne();
		System.out.println("Counter 1: " + sdp1.count);
		System.out.println("Counter 2: " + sdp2.count);
		
	}

}

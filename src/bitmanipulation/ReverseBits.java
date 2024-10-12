package bitmanipulation;

public class ReverseBits {
	public static void main(String[] args) {
		System.out.println(reverseBit(23));
	}

	public static int reverseBit(int num) {

//		System.out.println("Recived: " + Integer.toBinaryString(num));
		
		// manually printing all bits

		/*
		 * StringBuilder result = new StringBuilder();
		 * 
		 * for(int i = 31; i >= 0 ; i--) { int mask = 1 << i; result.append((num & mask)
		 * != 0 ? "1" : "0"); }
		 * 
		 * System.out.println(result.toString());
		 */

		for (int i = 0; i < 16; i++) {
			int t1 = (num >> i) & 1;
			int t2 = (num >> (31 - i)) & 1;

			if (t1 != t2) {
				num ^= (1 << i);
				num ^= (1 << (31 - i));
			}
		}

		return num;
	}

}

package Controller;

public class Rec {
	public int FatR(int N) {
		if (N==0) {
			return 1;
		}else {
			N = N * FatR(N-1);
			return N;
		}
	}
}

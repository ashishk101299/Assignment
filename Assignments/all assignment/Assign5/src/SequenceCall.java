package series;

public class SequenceCall {


public static Sequence createLinear(int a, int b){
	Sequence S = new LinearSequence(a, b);
	return S;
	}

public static Sequence createPower(int a) {
	Sequence K = new PowerSequence(a);
	return K;
	}	


}


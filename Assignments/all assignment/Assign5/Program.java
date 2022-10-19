import series.*;

public class Program {

	public static void main(String[] args){
	int x = Integer.parseInt(args[0]);	
	int y = Integer.parseInt(args[1]);
	int z = Integer.parseInt(args[2]);
	int temp = Integer.parseInt(args[3]);
	Sequence s = SequenceCall.createLinear(x, y);
	Sequence p = SequenceCall.createPower(y);
	System.out.printf("Linera Sequence is:%.2f%n",s.getSum(z));
	System.out.printf("Power Sequence is:%.2f%n",p.getSum(temp));
	}



}

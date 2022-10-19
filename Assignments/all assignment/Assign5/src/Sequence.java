package series;

public abstract class Sequence {

	protected int current;

	public double getSum(int count){
		double total = 0;
		for(int i = 1;i<=count;++i){

			total = total + getNext();

		}
		return total;

	}

	public abstract int getNext();

}

package series;

    class PowerSequence extends Sequence {
	int factor;
	int current = 1;

	public PowerSequence(int ratio) {
	
	factor = ratio;

	}
	
	public int getNext() {
		int term = current;
		current *= factor;
		return term;
	
	}


}

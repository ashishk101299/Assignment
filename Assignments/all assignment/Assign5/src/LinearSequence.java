package series;

  class LinearSequence extends Sequence { 

	int step;

	public LinearSequence(int ct,int st){
		step = st;
		current = ct;
	
	}

	public int getNext(){
		int term = current;
		current += step;
		return term;
	
	}


}

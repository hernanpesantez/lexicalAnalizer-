//class object pair
class Pair extends FunExp {
	Pair(ExpList e) {
		expList = e;
	}

	// function to get pair operation
	String getOp() {
		return "pair";
	}
}
//Function to add nill expression 
class NotE extends FunExp {
	NotE(ExpList exp) {
		expList = exp;
	}

	// getting function operation not
	String getOp() {
		return "not";
	}
}
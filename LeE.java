//class to add LE expression
class LeE extends FunExp {
	LeE(ExpList e) {
		expList = e;
	}

	// getting function operation
	String getOp() {
		return "<=";
	}
}
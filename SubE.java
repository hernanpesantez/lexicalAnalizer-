
//Class object for function expression sub
class SubE extends FunExp {
	SubE(ExpList e) {
		expList = e;
	}

	// getting funtion operation for sub
	String getOp() {
		return "-";
	}
}
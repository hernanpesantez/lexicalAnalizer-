
class EqE extends FunExp {
	// Adding expression for eq sign
	EqE(ExpList exp) {
		expList = exp;
	}

	String getOp() {
		return "=";
	}
}
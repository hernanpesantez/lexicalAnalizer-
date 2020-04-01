
//class for adding function expression "first"
class First extends FunExp {

	First(ExpList e_) {
		expList = e_;
	}

	String getOp() {
		return "first";
	}
}
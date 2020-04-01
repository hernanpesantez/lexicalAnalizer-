
//class expList to derive the following
// ⟨exp list⟩ → ε | ⟨exp⟩ ⟨exp list⟩

class ExpList {
	Exp exp;
	ExpList expList;

	ExpList(Exp e, ExpList expList_) {
		exp = e;
		expList = expList_;
	}

	// first expression
	Exp firstExp() {
		return exp;
	}

	// second expression add to list
	Exp secondExp() {
		return expList.firstExp();
	}
}
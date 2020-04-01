import java.util.*;

//Abstract class 
// ⟨exp⟩ → ⟨id⟩ | ⟨int⟩ | ⟨float⟩ | ⟨floatE⟩ | ⟨floatF⟩ | "nil" | "(" ⟨fun exp⟩ ")" | "if" ⟨exp⟩ "then" ⟨exp⟩ "else" ⟨exp⟩
abstract class Exp {
	void printParseTree(String indent) {
		IO.displayln(indent + indent.length() + " <exp>");
	}
}
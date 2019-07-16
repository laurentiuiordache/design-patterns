package behavioral.interpreter;


import behavioral.interpreter.beans.AndExpression;
import behavioral.interpreter.beans.Expression;
import behavioral.interpreter.beans.OrExpression;
import behavioral.interpreter.beans.TerminalExpression;

public class TestInterpretor {
    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");
        Expression terminal4 = new TerminalExpression("Water");

        Expression nonTerminalOr1 = new OrExpression(terminal1, terminal2);
        Expression nonTerminalOr2 = new OrExpression(nonTerminalOr1, terminal3);
        Expression nonTerminalAnd = new AndExpression(nonTerminalOr2, terminal4);

        return nonTerminalAnd;
    }

    public static void main(String[] args) {
        String context = "Searching for Lions that drink Water";

        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }
}

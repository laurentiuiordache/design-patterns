package behavioral.visitor.beans.visitor;

import behavioral.visitor.beans.Fender;
import behavioral.visitor.beans.Oil;
import behavioral.visitor.beans.PartsOrder;
import behavioral.visitor.beans.Wheel;

public class AtcPartsDisplayVisitor implements AtvPartVisitor {
    private int wheels;
    private int fenders;
    private int oils;

    @Override
    public void visit(Wheel wheel) {
        wheels++;
    }

    @Override
    public void visit(Fender fender) {
        fenders++;
    }

    @Override
    public void visit(Oil oil) {
        oils++;
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.printf("Wheels: %d \nFenders: %d \nOils: %d", wheels, fenders, oils);
    }
}

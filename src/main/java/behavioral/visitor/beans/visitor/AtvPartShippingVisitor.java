package behavioral.visitor.beans.visitor;


import behavioral.visitor.beans.*;

import java.util.List;

public class AtvPartShippingVisitor implements AtvPartVisitor {

    double shippingAmount = 0;

    @Override
    public void visit(Wheel wheel) {
        shippingAmount += 12;
        System.out.println("Wheels are expensive to ship.");
    }

    @Override
    public void visit(Fender fender) {
        shippingAmount += 3;
        System.out.println("Fender is cheap to ship.");
    }

    @Override
    public void visit(Oil oil) {
        shippingAmount += 9;
        System.out.println("Oil is hazardous to ship.");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        List<AtvPart> parts = partsOrder.getParts();
        if(parts.size() > 3){
            shippingAmount -= 5;
        }
        System.out.println("Shipping amount is: " + shippingAmount);
    }
}

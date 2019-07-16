package behavioral.visitor.beans;

import behavioral.visitor.beans.visitor.AtvPartVisitor;

public class Wheel implements AtvPart {

    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}

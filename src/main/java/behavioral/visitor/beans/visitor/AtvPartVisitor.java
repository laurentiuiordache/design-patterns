package behavioral.visitor.beans.visitor;

import behavioral.visitor.beans.Fender;
import behavioral.visitor.beans.Oil;
import behavioral.visitor.beans.PartsOrder;
import behavioral.visitor.beans.Wheel;

public interface AtvPartVisitor {

    void visit(Wheel wheel);

    void visit(Fender fender);

    void visit(Oil oil);

    void visit(PartsOrder partsOrder);

}

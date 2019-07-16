package behavioral.visitor;

import behavioral.visitor.beans.Fender;
import behavioral.visitor.beans.Oil;
import behavioral.visitor.beans.Wheel;
import behavioral.visitor.beans.PartsOrder;
import behavioral.visitor.beans.visitor.AtcPartsDisplayVisitor;
import behavioral.visitor.beans.visitor.AtvPartShippingVisitor;

public class TestVisitor {
    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.addPart(new Wheel());
        order.addPart(new Fender());
        order.addPart(new Oil());
        order.addPart(new Oil());

        order.accept(new AtvPartShippingVisitor());
        order.accept(new AtcPartsDisplayVisitor());
    }
}

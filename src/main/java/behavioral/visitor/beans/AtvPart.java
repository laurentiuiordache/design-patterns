package behavioral.visitor.beans;

import behavioral.visitor.beans.visitor.AtvPartVisitor;

public interface AtvPart {
    public void accept(AtvPartVisitor visitor);
}

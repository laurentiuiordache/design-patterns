package behavioral.visitor.beans;

import behavioral.visitor.beans.visitor.AtvPartVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {
    private List<AtvPart> parts = new ArrayList<>();

    public PartsOrder() {

    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart atvPart : parts) {
            atvPart.accept(visitor);
        }
        visitor.visit(this);
    }

    public void addPart(AtvPart atvPart) {
        parts.add(atvPart);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }


}

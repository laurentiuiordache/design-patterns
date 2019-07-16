package behavioral.chainOfResponsability.beans.handler;

import behavioral.chainOfResponsability.beans.request.Request;

public abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}

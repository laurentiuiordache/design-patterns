package behavioral.chainOfResponsability;

import behavioral.chainOfResponsability.beans.handler.CEO;
import behavioral.chainOfResponsability.beans.handler.Director;
import behavioral.chainOfResponsability.beans.handler.VP;
import behavioral.chainOfResponsability.beans.request.Request;
import behavioral.chainOfResponsability.beans.request.RequestType;

public class TestChainOfResponsability {
    public static void main(String[] args) {
        Director bryan = new Director();
        VP crystal = new VP();
        CEO jeff = new CEO();

        bryan.setSuccessor(crystal);
        crystal.setSuccessor(jeff);

        Request request = new Request(RequestType.CONFERENCE, 500);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        bryan.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        bryan.handleRequest(request);
    }
}
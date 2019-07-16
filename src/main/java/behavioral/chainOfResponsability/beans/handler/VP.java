package behavioral.chainOfResponsability.beans.handler;

import behavioral.chainOfResponsability.beans.request.Request;
import behavioral.chainOfResponsability.beans.request.RequestType;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE && request.getAmount() < 1500) {
            System.out.println("VP can approve the purchase ");
        } else {
            successor.handleRequest(request);
        }
    }
}

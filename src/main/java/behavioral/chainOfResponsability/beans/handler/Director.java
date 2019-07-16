package behavioral.chainOfResponsability.beans.handler;

import behavioral.chainOfResponsability.beans.request.Request;
import behavioral.chainOfResponsability.beans.request.RequestType;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conferences");
        } else {
            successor.handleRequest(request);
        }
    }
}

package behavioral.chainOfResponsability.beans.handler;

import behavioral.chainOfResponsability.beans.request.Request;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("The CEO can do anything!");
    }
}

package com.epam.responsibilityChain.responsibilityChainLogic;

public abstract class VacancyHandler {
VacancyHandler successor;

     public void setSuccessor(VacancyHandler successor) {
        this.successor = successor;
    }
    public abstract void handleRequest(ResumeEnum request);
}


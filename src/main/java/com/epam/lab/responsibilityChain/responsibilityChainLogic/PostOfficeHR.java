package com.epam.lab.responsibilityChain.responsibilityChainLogic;

import org.apache.log4j.Logger;

public class PostOfficeHR extends VacancyHandler {
    private final static Logger log = Logger.getLogger(PostOfficeHR.class);

    public void handleRequest(ResumeEnum request) {
        if (request == ResumeEnum.POSTMAN) {
            log.info("PostOffice get new " + request);
        } else {
            log.info("PostOffice does'nt need " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}


package com.epam.lab.responsibilityChain.responsibilityChainLogic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FireStationHR extends VacancyHandler {
    private final static Logger log = LogManager.getLogger(FireStationHR.class);

    public void handleRequest(ResumeEnum request) {
        if (request == ResumeEnum.FIREMAN) {
            log.info("FireStation get new " + request);
        } else {
            log.info("FireStation does'nt need " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}


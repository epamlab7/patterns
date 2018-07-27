package com.epam.lab.responsibilityChain.responsibilityChainLogic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MedicalClinicHR extends VacancyHandler {
    private final static Logger log = LogManager.getLogger(MedicalClinicHR.class);

    public void handleRequest(ResumeEnum request) {
        if (request == ResumeEnum.MEDIC) {
            log.info("MedicalClinic get new " + request);
        } else {
            log.info("MedicalClinic does'nt need " + request);
            if (successor != null) {
                successor.handleRequest(request);
            }
        }
    }
}


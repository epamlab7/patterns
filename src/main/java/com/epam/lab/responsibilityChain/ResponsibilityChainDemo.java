package com.epam.lab.responsibilityChain;



public class ResponsibilityChainDemo {
    public static void startResponsibilityChain() {
        VacancyHandler vacancies = setUpQueue();
        vacancies.handleRequest(ResumeEnum.MEDIC);
        vacancies.handleRequest(ResumeEnum.POSTMAN);
        vacancies.handleRequest(ResumeEnum.FIREMAN);
        vacancies.handleRequest(ResumeEnum.POLITIC);
    }

    public static VacancyHandler setUpQueue() {
        VacancyHandler medicVacancyHandler = new MedicalClinicHR();
        VacancyHandler firemanVacancyHandler = new FireStationHR();
        VacancyHandler postmanVacancyHandler = new PostOfficeHR();
        medicVacancyHandler.setSuccessor(firemanVacancyHandler);
        firemanVacancyHandler.setSuccessor(postmanVacancyHandler);
        return medicVacancyHandler;
    }
}


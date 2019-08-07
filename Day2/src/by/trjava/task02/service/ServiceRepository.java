package by.trjava.task02.service;

import by.trjava.task02.service.impl.EditionServiceImpl;

public final class ServiceRepository {
        //Singleton
        private static final ServiceRepository instance = new ServiceRepository();

        private final EditionService applianceService = new EditionServiceImpl();

        private ServiceRepository() {
        }

        public EditionService getEditionService() {
            return applianceService;
        }

        public static ServiceRepository getInstance() {
            return instance;
        }
    }


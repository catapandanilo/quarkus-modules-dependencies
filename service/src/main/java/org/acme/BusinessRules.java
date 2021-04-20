package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BusinessRules {

    public String getCompanyName() {
        return "Catapan S/A";
    }
}

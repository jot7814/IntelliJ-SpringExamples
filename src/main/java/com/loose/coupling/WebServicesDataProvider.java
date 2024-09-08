package com.loose.coupling;

public class WebServicesDataProvider implements UserDataProvider {


    @Override
    public String getUserDetails() {
        return "User Details from Web Services";
    }
}

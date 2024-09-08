package com.loose.coupling;

public class LooseCouplingExample {

    public static void main(String[] args) {

      UserDataProvider databaseProvider = new UserDatabaseProvider();
      UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServicesProvider = new WebServicesDataProvider();
        UserManager userManagerWithWS = new UserManager(webServicesProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newUserProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDB = new UserManager(newUserProvider);
        System.out.println(userManagerWithNewDB.getUserInfo());
    }
}

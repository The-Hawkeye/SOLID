package org.rtb.DependencyInversionPrinciple;

public class UserService {

    private MySQLDB mysqlDB = new MySQLDB();
    private MongoDB mongoDB = new MongoDB();

    public void insertUser() {
        mysqlDB.inertRow();
    }
}

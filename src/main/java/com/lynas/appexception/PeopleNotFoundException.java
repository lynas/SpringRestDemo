package com.lynas.appexception;

/**
 * Created by LynAs on 06-Mar-16
 */
public class PeopleNotFoundException extends RuntimeException {
    private long peopleID;

    public PeopleNotFoundException(long peopleID) {
        this.peopleID = peopleID;
    }

    public long getPeopleID() {
        return peopleID;
    }
}

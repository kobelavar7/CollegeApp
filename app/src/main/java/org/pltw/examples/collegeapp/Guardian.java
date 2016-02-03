package org.pltw.examples.collegeapp;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wdumas on 2/11/2015.
 */
public class Guardian {
    private String mOccupation;
    private String mFirstName;
    private String mLastName;

    public Guardian(){
        super();
        setFirstName("Roger");
        setLastName("Dumas");
    }

    public Guardian(String firstName, String lastName) {
        super();
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getOccupation() {
        return mOccupation;
    }

    public void setOccupation(String occupation) {
        mOccupation = occupation;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }
}

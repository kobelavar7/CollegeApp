package org.pltw.examples.collegeapp;



import org.json.JSONException;
import org.json.JSONObject;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by wdumas on 12/22/2014.
 */
public abstract class Profile implements ApplicantData {

    private String mFirstName;
    private String mLastName;
    private Date mDateOfBirth;

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public Date getDateOfBirth() {
        return mDateOfBirth;
    }

    public String dobToString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(mDateOfBirth.getTime());
    }

    public void setmDateOfBirth(Date mDateOfBirth) {
        this.mDateOfBirth = mDateOfBirth;
    }

    public Profile() {
        mFirstName = new String("Wyatt");
        mLastName = new String("Dumas");
        mDateOfBirth = new Date(83, 0, 24);
    }

    public String toString() {
        return mFirstName + " " + mLastName + " " + mDateOfBirth.getTime();
    }


}

package org.pltw.examples.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import static org.pltw.examples.collegeapp.FamilyMember.*;
import static org.pltw.examples.collegeapp.FamilyMember.SIBLING;

/**
 * Created by PLTW on 1/19/2016.
 */
public class Family_Member_Activity extends FragmentActivity {
    private Bundle savedInstanceState;
    private final R =


    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_member);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null) {
            if (getIntent().getIntExtra(String.valueOf(EXTRA_RELATION), 0) == GUARDIAN) {
                fragment = new GuardianFragment();
                fm.beginTransaction()
                        .add(R.id.fragmentContainer, fragment)
                        .commit();
            } else if (getIntent().getIntExtra(String.valueOf(EXTRA_RELATION), 0) == SIBLING)
                return;
            fragment = new SiblingFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}


package org.pltw.examples.collegeapp;

import android.content.Context;
import android.util.Log;
import org.json.JSONException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by PLTW on 12/4/2015.
 */
public class ProfileJSONStorer extends JSONStorer {
    private final String TAG = "ProfileJSONStorer";

    public ProfileJSONStorer(Context c, String f){
        super(c,f);
    }

    @Override
    public ApplicantData load() throws IOException, JSONException {
        return null;
    }



    public void save(ApplicantData applicantData) throws JSONException, IOException {
        if (applicantData instanceof Profile) {
            Profile profile = (Profile)applicantData;
            Writer writer = null;
            try {
                Log.d(TAG, "Profile in JSON: " + profile.toJSON().toString() + " saved to: " +
                        mFilename);
                OutputStream out = mContext.openFileOutput(mFilename, Context.MODE_PRIVATE);
                writer = new OutputStreamWriter(out);
                writer.write(profile.toJSON().toString());
            } finally {
                if (writer != null)
                    writer.close();
            }
        }
    }
}


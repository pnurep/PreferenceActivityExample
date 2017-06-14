package com.android.duse.gold.preferenceactivityexample;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by Gold on 2017-06-14.
 */

public class SettingsActivityDirectGen extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // deprecated
        // addPreferencesFromResource(R.xml.pref_settings);

        getFragmentManager().beginTransaction().replace(android.R.id.content, new Prefs1Fragment()).commit();
    }


    public static class Prefs1Fragment extends PreferenceFragment {
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            PreferenceManager.setDefaultValues(getActivity(), R.xml.pref_settings, false);
            addPreferencesFromResource(R.xml.pref_settings);
        }
    }

}

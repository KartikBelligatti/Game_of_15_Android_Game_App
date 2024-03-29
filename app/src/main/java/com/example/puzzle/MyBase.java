package com.example.puzzle;

import android.content.Context;
import android.content.SharedPreferences;

public class MyBase {
    public static final String SHARED_PREF="sharedPref";
    public static final String LAST_STEP="lastStep";
    public static final String LAST_TIME="lastTime";
    public static final String BEST_TIME="bestTime";
    public static final String BEST_STEP="bestTime";
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    MyBase(Context context){
        preferences = context.getSharedPreferences(SHARED_PREF,context.MODE_PRIVATE);
        editor=preferences.edit();

    }
    public void saveLastStep(int steps){
        editor.putInt(LAST_STEP,steps).commit();

    }
    public int getLastStep(){
        return preferences.getInt(LAST_STEP,0);
    }
    public void saveBestStep(int steps){
        editor.putInt(BEST_STEP,steps).commit();

    }
    public int getBestStep(){
        return preferences.getInt(BEST_STEP,0);
    }
    public void saveLastTime(int steps){
        editor.putInt(LAST_TIME,steps).commit();

    }
    public int getLastTime(){
        return preferences.getInt(LAST_TIME,0);
    }
    public void saveBestTime(int steps){
        editor.putInt(BEST_TIME,steps).commit();

    }
    public int getBestTime(){
        return preferences.getInt(BEST_TIME,0);
    }
}

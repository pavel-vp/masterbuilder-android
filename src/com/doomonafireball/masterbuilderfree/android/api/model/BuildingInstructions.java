package com.doomonafireball.masterbuilderfree.android.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * User: derek Date: 2/21/14 Time: 6:30 PM
 */
public class BuildingInstructions {

    @SerializedName("description") public String description;
    @SerializedName("idInstruction") public String idInstruction;
    @SerializedName("name") public String name;
    @SerializedName("shortcutPicture") public String shortcutPicture;
    @SerializedName("stepGroups") public ArrayList<Step> steps;

    public Integer stepsCount = -1;
}

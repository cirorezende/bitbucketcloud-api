package com.chimerapps.bitbucketcloud.api.model;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class Branch {

    @NotNull
    @SerializedName("name")
    private final String mName;

    Branch(@NotNull String name) {
        this.mName = name;
    }

    @NotNull
    public String getBranchName() {
        return mName;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + mName + '\'' +
                '}';
    }
}

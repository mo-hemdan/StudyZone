package com.example.mystudyzone;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"name", "start_date", "start_time"})
public class Period {
    @NonNull
    public String name = "";

    @ColumnInfo(name = "type")
    public String type;

    @NonNull
    public String start_date= "";

    @NonNull
    public String start_time= "";

    @ColumnInfo(name = "duration")
    public String duration;

}
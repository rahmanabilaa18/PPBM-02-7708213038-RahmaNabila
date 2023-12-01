package com.example.baru;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

public class list_adapter extends ArrayAdapter<list_data> {

    public list_adapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}

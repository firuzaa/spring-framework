package com.company.services;

import com.company.interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {
    @Override
    public int getHours() {
        return 6;
    }
}

package com.compscicenter;

import java.util.HashMap;

/**
 * Class for storage
 *
 */

public class Storage {
    private HashMap storage;

    Storage() {
        storage = new HashMap<String, String>();
    }

    public boolean addRecord(Record rec) {
        boolean isExist = storage.containsKey(rec.name);
        storage.put(rec.name, rec.number);
        return isExist;
    }

    public Record getRecord(String name) {
        boolean isExist = storage.containsKey(name);
        if (isExist) {
            return new Record(name, (String)storage.get(name));
        } else {
            return null;
        }
    }

    public Record deleteRecord(String name) {
        boolean isExist = storage.containsKey(name);
        if (isExist) {
            return new Record(name, (String)storage.remove(name));
        } else {
            return null;
        }
    }
}

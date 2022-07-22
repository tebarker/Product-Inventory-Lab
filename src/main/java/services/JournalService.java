package services;

import models.Journal;

import java.util.ArrayList;
import java.util.List;

public class JournalService {

    private static int nextId = 1;

    private static final ArrayList<Journal> inventory = new ArrayList<>();
    public List<Journal> getInventory() {
        return inventory;
    }

    public static Journal create(int id, String type, String brand, int size, int qty, double price) {

        Journal createdJournal = new Journal(nextId++, type,  brand, size, qty, price);
        inventory.add(createdJournal);
        return createdJournal;
    }

    public Journal findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return null;
    }

    //read all
    public Journal[] findAll() {
        // should return a basic array copy of the ArrayList
        return new Journal[0];
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        return false;
    }


    }





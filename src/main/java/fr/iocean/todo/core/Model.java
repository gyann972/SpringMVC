package fr.iocean.todo.core;

import java.io.Serializable;

public interface Model extends Serializable {

    int getId();
    void setId(int id);
}
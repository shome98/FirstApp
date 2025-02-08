package com.example.FirstApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    private Laptop laptop;
    private Laptop _laptop;

    @Autowired
    private Computer comp;
    public Dev(Laptop laptop){
        this._laptop=laptop;
    }
    public void build(){

        laptop.compile();
        _laptop.compile();
        comp.compile();
        System.out.println("Working on awesome project");
    }
}

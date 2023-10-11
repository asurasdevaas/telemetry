package com.asuras.shared.infraestructure;

import com.asuras.shared.domain.Monitoring;

import java.util.HashMap;

public class InConsoleMonitoring implements Monitoring {

    public void incrementCounter(int times)
    {
        System.out.println("Counter: " + times);

    };

    public void incrementGauge(int times)
    {
        System.out.println("Counter: " + times);

    };

    public void decrementGauge(int times)
    {
        System.out.println("Counter: " + times);

    };

    public void setGauge(int value)
    {
        System.out.println("Counter: " + value);

    };


    public void observeHistogram(int value, HashMap<String, String> labels)
    {
        System.out.println("Counter: " + value);

    };

}

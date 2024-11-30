package com.myclass;

public class Atmosphere {

    private float hydrogen;
    private float methane;
    private float helium;
    private float argon;
    private float carbonDioxide;
    private float sodium;

    public Atmosphere(){
     this.hydrogen = 0;
     this.methane = 0;
     this.helium = 0;
     this.argon= 0;
     this.carbonDioxide = 0;
     this.sodium = 0;

    }

    public Atmosphere(float hydrogen, float methane, float helium, float argon, float carbonDioxide, float sodium){
        this.hydrogen = hydrogen;
        this.methane = methane;
        this.helium = helium;
        this.argon= argon;
        this.carbonDioxide = carbonDioxide;
        this.sodium = sodium;
    }


    //getter
    public float getHydrogen (){
        return this.hydrogen;
    }

    public float getMethane (){
        return this.methane;
    }

    public float getHelium (){
        return this.helium;
    }

    public float getArgon (){
        return this.argon;
    }
    public float getCarbonDioxide (){
        return this.carbonDioxide;
    }

    public float getSodium (){
        return this.sodium;
    }


    //setter
    public void setHydrogen (float value){
        this.hydrogen = value;
    }

    public void setMethane (float value){
        this.methane = value;
    }

    public void setHelium (float value){
        this.helium = value;
    }

    public void qetArgon (float value){
        this.argon = value;
    }

    public void setCarbonDioxide (float value){
        this.carbonDioxide = value;
    }

    public void setSodium (float value){
        this.sodium = value;
    }
}

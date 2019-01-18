package com.shiyanlou.demo.loosely_coupled;

public class OutputHelper {
    public IOutputGenerator outputGenerator;

    public void generateOutput(){
        this.outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
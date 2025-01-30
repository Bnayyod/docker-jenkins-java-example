package com.example;

public class Hello {

    private static final String HELLO_MESSAGE = "Hello.";
    private static final String JENKINS_MESSAGE = "Thank you from Jenkins.";
    public static void main(String[] args){
        System.out.println(HELLO_MESSAGE);
        System.out.println(JENKINS_MESSAGE);
    }

    public String getHelloMessage(){
        return HELLO_MESSAGE;
    }
    public String getJenkinsMessage(){
        return JENKINS_MESSAGE;
    }
}

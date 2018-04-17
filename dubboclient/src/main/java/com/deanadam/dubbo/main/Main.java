package com.deanadam.dubbo.main;

import com.deanadam.dubbo.action.ChatAction;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	int i=0;
    	while(i++<100){
    		ChatAction act = new ChatAction();
    		act.SayHello();
    		Thread.sleep(3000);
    	}
    }

}

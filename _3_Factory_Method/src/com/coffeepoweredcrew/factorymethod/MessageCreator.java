package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage(){
        
        //getting msg from ==> SUBCLASS
        Message msg= createMessage();
        
        //performing concrete operations
        msg.addDefaultHeaders();
        msg.encrypt();

        return msg;
    }

    //FACTORY METHOD TO CREATE MESSAGE

    public abstract Message createMessage();
	
}

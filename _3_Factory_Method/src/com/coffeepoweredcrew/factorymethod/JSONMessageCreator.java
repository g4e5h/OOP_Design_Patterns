package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.JSONMessage;
import com.coffeepoweredcrew.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    protected Message createMessage() {
        return new JSONMessage();
    }
	
}

package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory2.aws.AwsResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {


    private ResourceFactory resourceFactory;

    public Client(ResourceFactory resourceFactory){
        this.resourceFactory=resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int storageMib){
        Instance instance= resourceFactory.createInstance(capacity);
        Storage storage=resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);

        return instance;
    }

    public static void main(String[] args) {
    	
        Client awsClient=new Client(new AwsResourceFactory());
        Instance awsInstance =awsClient.createServer(Instance.Capacity.large, 20480);
        awsInstance.start();
        awsInstance.stop();
        System.out.println("------------------------------------------------------------");
        Client googleClient=new Client(new GoogleResourceFactory());
        Instance googleInstance =googleClient.createServer(Instance.Capacity.small, 10240);
        googleInstance.start();
        googleInstance.stop();

    }

}

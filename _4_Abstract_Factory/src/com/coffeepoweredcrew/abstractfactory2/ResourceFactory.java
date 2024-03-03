package com.coffeepoweredcrew.abstractfactory2;

import com.coffeepoweredcrew.abstractfactory2.Instance.Capacity;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int mib);

}

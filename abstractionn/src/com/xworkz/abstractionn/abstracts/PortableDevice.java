package com.xworkz.abstractionn.abstracts;



import com.xworkz.abstractionn.main.Television;

import javax.management.MalformedObjectNameException;

public abstract class PortableDevice extends Television {
    public static int totalChannels=4567;
    public abstract void stream(String channelName);
}

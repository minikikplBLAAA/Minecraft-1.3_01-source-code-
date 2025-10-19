package net.minecraft.src;
 

import net.minecraft.server.MinecraftServer;

public final class ThreadServerApplication extends Thread
{

    public ThreadServerApplication(String s, MinecraftServer minecraftserver)
    {
    	super(s);
        mcServer = minecraftserver;
    }

    public void run()
    {
        mcServer.run();
    }

    final MinecraftServer mcServer; /* synthetic field */
}

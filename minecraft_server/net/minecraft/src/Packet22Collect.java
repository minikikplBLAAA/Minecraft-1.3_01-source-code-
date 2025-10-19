package net.minecraft.src;
 

import java.io.*;

public class Packet22Collect extends Packet
{

    public Packet22Collect()
    {
    }

    public Packet22Collect(int i, int j)
    {
        collectedEntityId = i;
        collectorEntityId = j;
    }

    public void readPacketData(DataInputStream datainputstream) throws IOException
    {
        collectedEntityId = datainputstream.readInt();
        collectorEntityId = datainputstream.readInt();
    }

    public void writePacketData(DataOutputStream dataoutputstream) throws IOException
    {
        dataoutputstream.writeInt(collectedEntityId);
        dataoutputstream.writeInt(collectorEntityId);
    }

    public void processPacket(NetHandler nethandler)
    {
        nethandler.handleCollect(this);
    }

    public int getPacketSize()
    {
        return 8;
    }

    public int collectedEntityId;
    public int collectorEntityId;
}

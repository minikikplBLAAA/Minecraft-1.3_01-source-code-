package net.minecraft.src;
 


public class TileEntitySign extends TileEntity
{

    public TileEntitySign()
    {
        lineBeingEdited = -1;
    }

    public void writeToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeToNBT(nbttagcompound);
        nbttagcompound.setString("Text1", signText[0]);
        nbttagcompound.setString("Text2", signText[1]);
        nbttagcompound.setString("Text3", signText[2]);
        nbttagcompound.setString("Text4", signText[3]);
    }

    public void readFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readFromNBT(nbttagcompound);
        for(int i = 0; i < 4; i++)
        {
            signText[i] = nbttagcompound.getString((new StringBuilder()).append("Text").append(i + 1).toString());
            if(signText[i].length() > 15)
            {
                signText[i] = signText[i].substring(0, 15);
            }
        }

    }

    public Packet func_20070_f()
    {
        String as[] = new String[4];
        for(int i = 0; i < 4; i++)
        {
            as[i] = signText[i];
        }

        return new Packet130(xCoord, yCoord, zCoord, as);
    }

    public String signText[] = {
        "", "", "", ""
    };
    public int lineBeingEdited;
}

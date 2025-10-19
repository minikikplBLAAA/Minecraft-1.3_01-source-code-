package net.minecraft.src;
 


public abstract class EntityAnimals extends EntityCreature
    implements IAnimals
{

    public EntityAnimals(World world)
    {
        super(world);
    }

    protected float getBlockPathWeight(int i, int j, int k)
    {
        if(worldObj.getBlockId(i, j - 1, k) == Block.grass.blockID)
        {
            return 10F;
        } else
        {
            return worldObj.getLightBrightness(i, j, k) - 0.5F;
        }
    }

    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        super.writeEntityToNBT(nbttagcompound);
    }

    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        super.readEntityFromNBT(nbttagcompound);
    }

    public boolean getCanSpawnHere()
    {
        int i = MathHelper.floor_double(posX);
        int j = MathHelper.floor_double(boundingBox.minY);
        int k = MathHelper.floor_double(posZ);
        return worldObj.getBlockId(i, j - 1, k) == Block.grass.blockID && worldObj.getBlockLightValue(i, j, k) > 8 && super.getCanSpawnHere();
    }

    public int func_146_b()
    {
        return 120;
    }
}

package net.minecraft.src;
 

import java.util.Random;

public class ItemSnowball extends Item
{

    public ItemSnowball(int i)
    {
        super(i);
        maxStackSize = 16;
    }

    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        itemstack.stackSize--;
        world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if(!world.multiplayerWorld)
        {
            world.entityJoinedWorld(new EntitySnowball(world, entityplayer));
        }
        return itemstack;
    }
}

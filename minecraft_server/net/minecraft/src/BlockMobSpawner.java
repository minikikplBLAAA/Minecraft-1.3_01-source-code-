package net.minecraft.src;
 

import java.util.Random;

public class BlockMobSpawner extends BlockContainer
{

    protected BlockMobSpawner(int i, int j)
    {
        super(i, j, Material.rock);
    }

    protected TileEntity getBlockEntity()
    {
        return new TileEntityMobSpawner();
    }

    public int idDropped(int i, Random random)
    {
        return 0;
    }

    public int quantityDropped(Random random)
    {
        return 0;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
}

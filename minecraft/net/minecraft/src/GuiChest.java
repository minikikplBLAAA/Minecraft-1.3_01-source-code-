package net.minecraft.src;
 

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class GuiChest extends GuiContainer
{

    public GuiChest(IInventory iinventory, IInventory iinventory1)
    {
        super(new CraftingInventoryChestCB(iinventory, iinventory1));
        field_980_m = 0;
        upperChestInventory = iinventory;
        lowerChestInventory = iinventory1;
        field_948_f = false;
        char c = '\336';
        int i = c - 108;
        field_980_m = iinventory1.getSizeInventory() / 9;
        ySize = i + field_980_m * 18;
    }

    protected void drawGuiContainerForegroundLayer()
    {
        fontRenderer.drawString(lowerChestInventory.getInvName(), 8, 6, 0x404040);
        fontRenderer.drawString(upperChestInventory.getInvName(), 8, (ySize - 96) + 2, 0x404040);
    }

    protected void drawGuiContainerBackgroundLayer(float f)
    {
        int i = mc.renderEngine.getTexture("/gui/container.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.renderEngine.bindTexture(i);
        int j = (width - xSize) / 2;
        int k = (height - ySize) / 2;
        drawTexturedModalRect(j, k, 0, 0, xSize, field_980_m * 18 + 17);
        drawTexturedModalRect(j, k + field_980_m * 18 + 17, 0, 126, xSize, 96);
    }

    private IInventory upperChestInventory;
    private IInventory lowerChestInventory;
    private int field_980_m;
}

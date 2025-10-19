package net.minecraft.src;
 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GuiStatsListener
    implements ActionListener
{

    GuiStatsListener(GuiStatsComponent guistatscomponent)
    {
        statsComponent = guistatscomponent;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        GuiStatsComponent.update(statsComponent);
    }

    final GuiStatsComponent statsComponent; /* synthetic field */
}

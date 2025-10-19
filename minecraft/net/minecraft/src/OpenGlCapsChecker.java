package net.minecraft.src;
 

import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GLContext;

public class OpenGlCapsChecker
{

    public OpenGlCapsChecker()
    {
    }

    public boolean checkARBOcclusion()
    {
        return tryCheckOcclusionCapable && GLContext.getCapabilities().GL_ARB_occlusion_query;
    }

    private static boolean tryCheckOcclusionCapable = false;

}

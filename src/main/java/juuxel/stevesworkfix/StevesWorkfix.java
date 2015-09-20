package juuxel.stevesworkfix;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import juuxel.stevesworkfix.reference.Reference;
import vswe.production.block.ModBlocks;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES)
public class StevesWorkfix
{
    @Mod.Instance
    public static StevesWorkfix instance;

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event)
    {
        ModBlocks.table.setBlockName("productionTable");
    }
}

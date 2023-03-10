package website.avid.avidarsenchanting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.simple.SimpleChannel;

@Mod(AvidArsEnchanting.ID)
public class AvidArsEnchanting {
    public static final String ID = "avid_ars_enchanting";
    public static final Logger LOGGER = LogManager.getLogger(ID);

    public static SimpleChannel CHANNEL;

    public AvidArsEnchanting() {
        var modEvent = FMLJavaModLoadingContext.get().getModEventBus();
        modEvent.addListener(this::onCommonSetup);
    }

    private void onCommonSetup(final FMLCommonSetupEvent event) {
    }
}

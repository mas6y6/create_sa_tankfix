package com.mas6y6.create_sa_tankfix;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;


@Mod(Create_sa_tankfix.MODID)
public class Create_sa_tankfix {
    public static final String MODID = "create_sa_tankfix";
    private static final Logger LOGGER = LogUtils.getLogger();
    public Create_sa_tankfix(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::gatherData);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        event.getGenerator().addProvider(
                event.includeServer(),
                new CuriosDataGenerator(
                        MODID,
                        event.getGenerator().getPackOutput(),
                        event.getExistingFileHelper(),
                        event.getLookupProvider()
                )
        );
    }
}

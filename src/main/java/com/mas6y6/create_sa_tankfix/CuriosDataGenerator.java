package com.mas6y6.create_sa_tankfix;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import top.theillusivec4.curios.api.CuriosDataProvider;

import java.util.concurrent.CompletableFuture;

public class CuriosDataGenerator extends CuriosDataProvider {

    public CuriosDataGenerator(String modId, PackOutput output, ExistingFileHelper fileHelper, CompletableFuture<HolderLookup.Provider> registries) {
        super(modId, output, fileHelper, registries);
    }

    @Override
    public void generate(HolderLookup.Provider registries, ExistingFileHelper fileHelper) {
        this.createEntities("player")
                .replace(false)
                .addPlayer()
                .addSlots("tank");

        this.createSlot("tank")
                .size(4)
                .icon(ResourceLocation.fromNamespaceAndPath(Create_sa_tankfix.MODID, "item/empty_tank"));
    }
}
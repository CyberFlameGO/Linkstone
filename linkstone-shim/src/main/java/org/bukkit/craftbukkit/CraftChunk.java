package org.bukkit.craftbukkit;

import net.glowstone.linkstone.Linkstone;
import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LDelegate;
import org.bukkit.Chunk;

import net.glowstone.chunk.GlowChunk;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class CraftChunk {
    @LDelegate(Chunk.class)
    public GlowChunk glow;

    public CraftChunk(GlowChunk glow) {
        this.glow = glow;
    }

    @LConstructor(version = V1_12_R1)
    public CraftChunk(net.minecraft.server.Chunk chunk) {
        this(chunk.glow);
    }

    public CraftWorld getCraftWorld() {
        return Linkstone.box(glow.getWorld());
    }

    public Chunk getHandle() {
        return Linkstone.box(glow);
    }
}
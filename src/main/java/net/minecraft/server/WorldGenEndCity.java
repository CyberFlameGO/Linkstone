package net.minecraft.server;

import java.util.Random;

public class WorldGenEndCity extends StructureGenerator {

    private final int a;

    private final int b;

    private final ChunkProviderTheEnd d;

    public WorldGenEndCity(ChunkProviderTheEnd chunkprovidertheend) {
    }

    public String a() {
        return null;
    }

    protected boolean a(int i, int j) {
        return false;
    }

    protected StructureStart b(int i, int j) {
        return null;
    }

    public static class Start extends StructureStart {

        private boolean c;

        public Start() {
        }

        public Start(World world, ChunkProviderTheEnd chunkprovidertheend, Random random, int i, int j) {
        }

        private void a(World world, ChunkProviderTheEnd chunkprovidertheend, Random random, int i, int j) {
        }

        public boolean a() {
            return false;
        }

        public void a(NBTTagCompound nbttagcompound) {
        }

        public void b(NBTTagCompound nbttagcompound) {
        }
    }
}

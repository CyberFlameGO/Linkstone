package net.minecraft.server;

import java.io.IOException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class PacketPlayOutPosition implements Packet<PacketListenerPlayOut> {

    private double a;

    private double b;

    private double c;

    private float d;

    private float e;

    private Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> f;

    private int g;

    public PacketPlayOutPosition() {
    }

    public PacketPlayOutPosition(double d0, double d1, double d2, float f, float f1, Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> set, int i) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }

    public static enum EnumPlayerTeleportFlags {

        X(0), Y(1), Z(2), Y_ROT(3), X_ROT(4);

        private final int f;

        private EnumPlayerTeleportFlags(int i) {
        }

        private int a() {
            return 0;
        }

        private boolean b(int i) {
            return false;
        }

        public static Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> a(int i) {
            return null;
        }

        public static int a(Set<PacketPlayOutPosition.EnumPlayerTeleportFlags> set) {
            return 0;
        }
    }
}

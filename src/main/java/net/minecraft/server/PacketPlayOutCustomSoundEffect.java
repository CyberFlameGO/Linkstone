package net.minecraft.server;

import java.io.IOException;
import org.apache.commons.lang3.Validate;

public class PacketPlayOutCustomSoundEffect implements Packet<PacketListenerPlayOut> {

    private String a;

    private SoundCategory b;

    private int c;

    private int d;

    private int e;

    private float f;

    private float g;

    public PacketPlayOutCustomSoundEffect() {
    }

    public PacketPlayOutCustomSoundEffect(String s, SoundCategory soundcategory, double d0, double d1, double d2, float f, float f1) {
    }

    public void a(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void b(PacketDataSerializer packetdataserializer) throws IOException {
    }

    public void a(PacketListenerPlayOut packetlistenerplayout) {
    }
}

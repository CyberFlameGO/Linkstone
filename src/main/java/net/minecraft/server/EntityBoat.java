package net.minecraft.server;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
// CraftBukkit start
import org.bukkit.Location;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;

// CraftBukkit end
public class EntityBoat extends Entity {

    private static final DataWatcherObject<Integer> a;

    private static final DataWatcherObject<Integer> b;

    private static final DataWatcherObject<Float> c;

    private static final DataWatcherObject<Integer> d;

    private static final DataWatcherObject<Boolean>[] e;

    private final float[] f;

    private float g;

    private float h;

    private float au;

    private int av;

    private double aw;

    private double ax;

    private double ay;

    private double az;

    private double aA;

    private boolean aB;

    private boolean aC;

    private boolean aD;

    private boolean aE;

    private double aF;

    private float aG;

    private EntityBoat.EnumStatus aH;

    private EntityBoat.EnumStatus aI;

    private double aJ;

    // CraftBukkit start
    // PAIL: Some of these haven't worked since a few updates, and since 1.9 they are less and less applicable.
    public double maxSpeed;

    public double occupiedDeceleration;

    public double unoccupiedDeceleration;

    public boolean landBoats;

    // CraftBukkit end
    public EntityBoat(World world) {
    }

    public EntityBoat(World world, double d0, double d1, double d2) {
    }

    protected boolean playStepSound() {
        return false;
    }

    protected void i() {
    }

    @Nullable
    public AxisAlignedBB j(Entity entity) {
        return null;
    }

    @Nullable
    public AxisAlignedBB ag() {
        return null;
    }

    public boolean isCollidable() {
        return false;
    }

    public double ay() {
        return 0.0;
    }

    public boolean damageEntity(DamageSource damagesource, float f) {
        return false;
    }

    public void collide(Entity entity) {
    }

    public Item j() {
        return null;
    }

    public boolean isInteractable() {
        return false;
    }

    public EnumDirection bm() {
        return null;
    }

    private Location lastLocation;

    // CraftBukkit
    public void m() {
    }

    private void s() {
    }

    public void a(boolean flag, boolean flag1) {
    }

    private EntityBoat.EnumStatus t() {
        return null;
    }

    public float k() {
        return 0.0F;
    }

    public float l() {
        return 0.0F;
    }

    private boolean u() {
        return false;
    }

    @Nullable
    private EntityBoat.EnumStatus v() {
        return null;
    }

    public static float a(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return 0.0F;
    }

    public static float b(IBlockData iblockdata, IBlockAccess iblockaccess, BlockPosition blockposition) {
        return 0.0F;
    }

    private void w() {
    }

    private void x() {
    }

    public void k(Entity entity) {
    }

    protected void a(Entity entity) {
    }

    protected void b(NBTTagCompound nbttagcompound) {
    }

    protected void a(NBTTagCompound nbttagcompound) {
    }

    public boolean a(EntityHuman entityhuman, @Nullable ItemStack itemstack, EnumHand enumhand) {
        return false;
    }

    protected void a(double d0, boolean flag, IBlockData iblockdata, BlockPosition blockposition) {
    }

    public boolean a(int i) {
        return false;
    }

    public void setDamage(float f) {
    }

    public float n() {
        return 0.0F;
    }

    public void b(int i) {
    }

    public int o() {
        return 0;
    }

    public void d(int i) {
    }

    public int q() {
        return 0;
    }

    public void setType(EntityBoat.EnumBoatType entityboat_enumboattype) {
    }

    public EntityBoat.EnumBoatType getType() {
        return null;
    }

    protected boolean q(Entity entity) {
        return false;
    }

    @Nullable
    public Entity bw() {
        return null;
    }

    static class SyntheticClass_1 {

        static final int[] a;

        static {
        }
    }

    public static enum EnumBoatType {

        OAK(BlockWood.EnumLogVariant.OAK.a(), "oak"), SPRUCE(BlockWood.EnumLogVariant.SPRUCE.a(), "spruce"), BIRCH(BlockWood.EnumLogVariant.BIRCH.a(), "birch"), JUNGLE(BlockWood.EnumLogVariant.JUNGLE.a(), "jungle"), ACACIA(BlockWood.EnumLogVariant.ACACIA.a(), "acacia"), DARK_OAK(BlockWood.EnumLogVariant.DARK_OAK.a(), "dark_oak");

        private final String g;

        private final int h;

        private EnumBoatType(int i, String s) {
        }

        public String a() {
            return null;
        }

        public int b() {
            return 0;
        }

        public String toString() {
            return null;
        }

        public static EntityBoat.EnumBoatType a(int i) {
            return null;
        }

        public static EntityBoat.EnumBoatType a(String s) {
            return null;
        }
    }

    public static enum EnumStatus {

        IN_WATER, UNDER_WATER, UNDER_FLOWING_WATER, ON_LAND, IN_AIR;

        private EnumStatus() {
        }
    }
}

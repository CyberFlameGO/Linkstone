package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import javax.annotation.Nullable;

public final class IEntitySelector {

    public static final Predicate<Entity> a;

    public static final Predicate<Entity> b;

    public static final Predicate<Entity> c;

    public static final Predicate<Entity> d;

    public static final Predicate<Entity> e;

    public static final Predicate<Entity> f;

    public static <T extends Entity> Predicate<T> a(final double d0, final double d1, final double d2, double d3) {
        return null;
    }

    public static <T extends Entity> Predicate<T> a(final Entity entity) {
        return null;
    }

    public static class EntitySelectorEquipable implements Predicate<Entity> {

        private final ItemStack a;

        public EntitySelectorEquipable(ItemStack itemstack) {
        }

        public boolean a(@Nullable Entity entity) {
            return false;
        }

        public boolean apply(Object object) {
            return false;
        }
    }
}

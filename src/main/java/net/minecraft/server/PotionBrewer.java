package net.minecraft.server;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class PotionBrewer {

    private static final List<PotionBrewer.PredicatedCombination<PotionRegistry>> a;

    private static final List<PotionBrewer.PredicatedCombination<Item>> b;

    private static final List<PotionBrewer.PredicateItem> c;

    private static final Predicate<ItemStack> d;

    public static boolean a(ItemStack itemstack) {
        return false;
    }

    protected static boolean b(ItemStack itemstack) {
        return false;
    }

    protected static boolean c(ItemStack itemstack) {
        return false;
    }

    public static boolean a(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    protected static boolean b(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    protected static boolean c(ItemStack itemstack, ItemStack itemstack1) {
        return false;
    }

    @Nullable
    public static ItemStack d(ItemStack itemstack, @Nullable ItemStack itemstack1) {
        return null;
    }

    public static void a() {
    }

    private static void a(ItemPotion itempotion, PotionBrewer.PredicateItem potionbrewer_predicateitem, ItemPotion itempotion1) {
    }

    private static void a(PotionBrewer.PredicateItem potionbrewer_predicateitem) {
    }

    private static void a(PotionRegistry potionregistry, Predicate<ItemStack> predicate, PotionRegistry potionregistry1) {
    }

    static class PredicateItem implements Predicate<ItemStack> {

        private final Item a;

        private final int b;

        public PredicateItem(Item item) {
        }

        public PredicateItem(Item item, int i) {
        }

        public boolean a(@Nullable ItemStack itemstack) {
            return false;
        }

        public boolean apply(Object object) {
            return false;
        }
    }

    static class PredicatedCombination<T> {

        final T a;

        final Predicate<ItemStack> b;

        final T c;

        public PredicatedCombination(T t0, Predicate<ItemStack> predicate, T t1) {
        }
    }
}

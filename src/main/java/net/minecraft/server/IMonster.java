package net.minecraft.server;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;

public interface IMonster extends IAnimal {

    Predicate<Entity> d;

    Predicate<Entity> e;
}

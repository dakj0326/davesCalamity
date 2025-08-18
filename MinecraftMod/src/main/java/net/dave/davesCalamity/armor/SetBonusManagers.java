package net.dave.davesCalamity.armor;


import net.minecraft.server.level.ServerPlayer;

import java.util.*;

public final class SetBonusManagers {
    private static final Map<UUID, SetBonusManager> MAP = new HashMap<>();

    public static SetBonusManager of(ServerPlayer p) {
        return MAP.computeIfAbsent(p.getUUID(), id -> new SetBonusManager());
    }

    public static void remove(ServerPlayer p) {
        MAP.remove(p.getUUID());
    }
}

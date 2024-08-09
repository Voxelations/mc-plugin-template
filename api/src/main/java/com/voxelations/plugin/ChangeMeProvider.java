package com.voxelations.plugin;

import org.checkerframework.checker.nullness.qual.Nullable;
import org.jetbrains.annotations.ApiStatus;

import java.util.Objects;

public class ChangeMeProvider {

    @Nullable
    private static ChangeMe instance = null;

    public static ChangeMe get() {
        return Objects.requireNonNull(instance);
    }

    @ApiStatus.Internal
    public static void set(@Nullable ChangeMe instance) {
        ChangeMeProvider.instance = instance;
    }
}

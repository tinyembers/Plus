package com.marcusslover.plus.lib.sound;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Note {
    @NotNull
    protected Sound sound;
    protected float volume;
    protected float pitch;
    @NotNull
    protected SoundCategory category;

    public Note(@NotNull Sound sound) {
        this(sound, 1.0f, 1.0f, SoundCategory.MASTER);
    }

    public Note(@NotNull Sound sound, float volume, float pitch) {
        this(sound, volume, pitch, SoundCategory.MASTER);
    }

    public Note(@NotNull Sound sound, float volume, float pitch, @NotNull SoundCategory category) {
        this.sound = sound;
        this.volume = volume;
        this.pitch = pitch;
        this.category = category;
    }

    @NotNull
    public Sound getSound() {
        return sound;
    }

    @NotNull
    public Note setSound(@NotNull Sound sound) {
        this.sound = sound;
        return this;
    }

    public float getVolume() {
        return volume;
    }

    @NotNull
    public Note setVolume(float volume) {
        this.volume = volume;
        return this;
    }

    public float getPitch() {
        return pitch;
    }

    @NotNull
    public Note setPitch(float pitch) {
        this.pitch = pitch;
        return this;
    }

    @NotNull
    public SoundCategory getCategory() {
        return category;
    }

    @NotNull
    public Note setCategory(@NotNull SoundCategory category) {
        this.category = category;
        return this;
    }

    @NotNull
    public Note play(@NotNull Player player) {
        return play(player, player.getLocation());
    }

    @NotNull
    public Note play(@NotNull Player player, @NotNull Location location) {
        player.playSound(location, sound, category, volume, pitch);
        return this;
    }
}
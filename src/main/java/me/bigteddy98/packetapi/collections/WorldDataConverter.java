package me.bigteddy98.packetapi.collections;

import net.minecraft.server.v1_7_R4.EnumDifficulty;
import net.minecraft.server.v1_7_R4.EnumGamemode;
import net.minecraft.server.v1_7_R4.WorldType;

import org.bukkit.Difficulty;
import org.bukkit.GameMode;
import org.bukkit.World.Environment;

public class WorldDataConverter {

	public static int getEnvironment(Environment env) {
		if (env == Environment.NETHER) {
			return -1;
		} else if (env == Environment.NORMAL) {
			return 0;
		} else if (env == Environment.THE_END) {
			return 1;
		}
		return -1;
	}

	public static EnumDifficulty getDifficulty(Difficulty diff) {
		for (EnumDifficulty dif : EnumDifficulty.values()) {
			if (dif.toString().equalsIgnoreCase(diff.toString())) {
				return dif;
			}
		}
		return null;
	}

	public static EnumGamemode getGameMode(GameMode gamemode) {
		for (EnumGamemode dif : EnumGamemode.values()) {
			if (dif.toString().equalsIgnoreCase(gamemode.toString())) {
				return dif;
			}
		}
		return null;
	}

	public static WorldType getLevel() {
		return WorldType.NORMAL;
	}
}

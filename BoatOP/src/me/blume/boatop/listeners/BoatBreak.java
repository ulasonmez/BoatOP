package me.blume.boatop.listeners;

import java.util.Random;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.inventory.ItemStack;

import me.blume.boatop.Main;
import me.blume.boatop.opitems.OpItem;

public class BoatBreak implements Listener{
	@SuppressWarnings("unused")
	private Main plugin;
	
	
	public BoatBreak(Main plugin) {
		this.plugin=plugin;
	}
	OpItem item = new OpItem();
	Random rand = new Random();
	int randomitem,randomitem2,enchnumber;
	EntityType aBoat=EntityType.BOAT;
	@EventHandler
	public void onBoatBroke(ItemSpawnEvent event) {
		
		if(event.getEntity().getItemStack().getType()==Material.ACACIA_BOAT||
				event.getEntity().getItemStack().getType()==Material.BIRCH_BOAT||
				event.getEntity().getItemStack().getType()==Material.DARK_OAK_BOAT ||
				event.getEntity().getItemStack().getType()==Material.OAK_BOAT ||
				event.getEntity().getItemStack().getType()==Material.SPRUCE_BOAT) {
			event.getEntity().remove();
		}
	}
	@EventHandler
	public void onBoatBreak(VehicleDestroyEvent event) {
		Player player = (Player) event.getAttacker();
		Entity boat = (Vehicle) event.getVehicle();
		if(boat.getType().equals(aBoat)){
			Location boatLoc = boat.getLocation();
			World world = player.getWorld();
			randomitem2=rand.nextInt(3)+1;
			for(int a =0;a<randomitem2;a++) {
				randomitem = rand.nextInt(100)+1;
				if(randomitem>=1 && randomitem<=3) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.TOTEM_OF_UNDYING));
				}
				if(randomitem>=4 && randomitem<=9) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.IRON_BLOCK,3));
				}
				if(randomitem>=10 && randomitem<=14) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.EXPERIENCE_BOTTLE,64));
				}
				if(randomitem>=15 && randomitem<=24) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.DIAMOND,5));
				}
				if(randomitem==25) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.ELYTRA));
				}
				if(randomitem>=26 && randomitem<=27) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
				}
				if(randomitem>=28 && randomitem<=37) {

					world.dropItemNaturally(boatLoc, new ItemStack(Material.GOLDEN_APPLE,4));
				}

				if(randomitem>=38 && randomitem<=42) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.NETHERITE_INGOT,2));
				}
				if(randomitem>=43 && randomitem<=52) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.GOLD_BLOCK));
				}
				if(randomitem>=53 && randomitem<=57) {

					enchnumber = rand.nextInt(2)+1;
					ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
					for(int i =0;i<enchnumber;i++) {
						item.helmetindex =rand.nextInt(2);
						item.level=rand.nextInt(6)+5;
						item.helmetmeta(helmet);
					}
					world.dropItemNaturally(boatLoc, helmet);
				}
				if(randomitem>=58 && randomitem<=62) {

					enchnumber = rand.nextInt(2)+1;
					ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
					for(int i =0;i<enchnumber;i++) {
						item.chestplateindex =rand.nextInt(2);
						item.level=rand.nextInt(6)+5;
						item.chestplatemeta(chestplate);
					}
					world.dropItemNaturally(boatLoc, chestplate);
				}
				if(randomitem>=63 && randomitem<=67) {


					enchnumber = rand.nextInt(2)+1;
					ItemStack leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
					for(int i =0;i<enchnumber;i++) {
						item.leggingsindex =rand.nextInt(2);
						item.level=rand.nextInt(6)+5;
						item.leggingsmeta(leggings);
					}
					world.dropItemNaturally(boatLoc, leggings);
				}
				if(randomitem>=68 && randomitem<=72) {

					enchnumber = rand.nextInt(4)+1;

					ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
					for(int i =0;i<enchnumber;i++) {
						item.bootsindex=rand.nextInt(4);
						item.level=rand.nextInt(6)+5;
						item.bootsmeta(boots);
					}
					world.dropItemNaturally(boatLoc, boots);
				}
				if(randomitem>=73 && randomitem<=77) {

					enchnumber = rand.nextInt(4)+1;

					ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
					for(int i =0;i<enchnumber;i++) {
						item.axeindex=rand.nextInt(2);
						item.level=rand.nextInt(6)+5;
						item.axemeta(axe);
					}
					world.dropItemNaturally(boatLoc, axe);
				}
				if(randomitem>=78 && randomitem<=82) {

					enchnumber = rand.nextInt(3)+1;
					ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
					for(int i =0;i<enchnumber;i++) {
						item.swordindex=rand.nextInt(3);
						item.level=rand.nextInt(6)+5;
						item.swordmeta(sword);
					}
					world.dropItemNaturally(boatLoc, sword);
				}

				if(randomitem>=83 && randomitem<=87) {

					enchnumber = rand.nextInt(3)+1;
					ItemStack bow = new ItemStack(Material.BOW);
					for(int i =0;i<enchnumber;i++) {
						item.bowindex=rand.nextInt(3);
						item.level=rand.nextInt(6)+5;
						item.bowmeta(bow);
					}
					world.dropItemNaturally(boatLoc, bow);
				}
				if(randomitem>=87 && randomitem<=92) {

					enchnumber = rand.nextInt(2)+1;
					ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);		
					for(int i =0;i<enchnumber;i++) {
						item.pickaxeindex=rand.nextInt(2);
						item.level=rand.nextInt(6)+5;
						item.pickaxemeta(pickaxe);
					}
					world.dropItemNaturally(boatLoc, pickaxe);
				}
				if(randomitem>=93 && randomitem<=96) {
					item.pickaxeindex=0;
					item.level=rand.nextInt(6)+5;
					ItemStack shovel = new ItemStack(Material.DIAMOND_SHOVEL);
					item.shovelmeta(shovel);
				}
				if(randomitem>=97 && randomitem<=100) {
					world.dropItemNaturally(boatLoc, new ItemStack(Material.TNT,16));
				}
			}
			
		}
	}

}

package ml.jozefpeeterslaan72wuustwezel.pepsimc;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class item {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "pepsimc");
	
	public static final RegistryObject<beverage> PEPSICAN = ITEMS.register("pepsican", ()-> new beverage(new Item.Properties()
			.tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new EffectInstance(Effects.DAMAGE_BOOST, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.HEALTH_BOOST, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.LUCK, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.DIG_SPEED, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.REGENERATION, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.ABSORPTION, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.DAMAGE_RESISTANCE, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.MOVEMENT_SPEED, 1600, 2),1)
					.build()
					).fireResistant()));
	
	public static final RegistryObject<beverage> PEPSIBOTTLE = ITEMS.register("pepsibottle", ()-> new beverage(new Item.Properties()
			.tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new EffectInstance(Effects.DAMAGE_BOOST, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.HEALTH_BOOST, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.LUCK, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.DIG_SPEED, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.REGENERATION, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.ABSORPTION, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.DAMAGE_RESISTANCE, 1600, 2),1)
					.effect(()->new EffectInstance(Effects.MOVEMENT_SPEED, 1600, 2),1)
					.build()
					).fireResistant()));
	
	public static final RegistryObject<Item> CARAMEL = ITEMS.register("caramel", ()-> new Item(new Item.Properties()
			.tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder()
					.effect(()->new EffectInstance(Effects.MOVEMENT_SPEED, 200, 1),1)
					.nutrition(2)
					.saturationMod(.2f)
					.build()
			).fireResistant()));
	
	public static final RegistryObject<Item> PHOSPHORIC_ACID = ITEMS.register("phosphoric_acid", ()-> new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> CAFFEINE = ITEMS.register("caffeine", ()-> new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<Item> STEVIA = ITEMS.register("stevia", ()-> new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MISC)));
	
	public static final RegistryObject<beverage> PEPSIMAXBOTTLE = ITEMS.register("pepsimaxbottle", ()-> new beverage(new Item.Properties()
			.tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new EffectInstance(Effects.DAMAGE_BOOST, 800, 2),1)
					.effect(()->new EffectInstance(Effects.HEALTH_BOOST, 800, 2),1)
					.effect(()->new EffectInstance(Effects.LUCK, 800, 2),1)
					.effect(()->new EffectInstance(Effects.DIG_SPEED, 800, 2),1)
					.effect(()->new EffectInstance(Effects.REGENERATION, 800, 2),1)
					.effect(()->new EffectInstance(Effects.ABSORPTION, 800, 2),1)
					.effect(()->new EffectInstance(Effects.DAMAGE_RESISTANCE, 800, 2),1)
					.effect(()->new EffectInstance(Effects.MOVEMENT_SPEED, 800, 2),1)
					.build()
			).fireResistant()));
	
	public static final RegistryObject<beverage> PEPSIMAXCAN = ITEMS.register("pepsimaxcan", ()-> new beverage(new Item.Properties()
			.tab(ItemGroup.TAB_FOOD)
			.food(new Food.Builder()
					.nutrition(2)
					.saturationMod(.2f)
					.effect(()->new EffectInstance(Effects.DAMAGE_BOOST, 800, 2),1)
					.effect(()->new EffectInstance(Effects.HEALTH_BOOST, 800, 2),1)
					.effect(()->new EffectInstance(Effects.LUCK, 800, 2),1)
					.effect(()->new EffectInstance(Effects.DIG_SPEED, 800, 2),1)
					.effect(()->new EffectInstance(Effects.REGENERATION, 800, 2),1)
					.effect(()->new EffectInstance(Effects.ABSORPTION, 800, 2),1)
					.effect(()->new EffectInstance(Effects.DAMAGE_RESISTANCE, 800, 2),1)
					.effect(()->new EffectInstance(Effects.MOVEMENT_SPEED, 800, 2),1)
					.build())));

	public static final RegistryObject<BlockItem> PEPSITEBLOCK = ITEMS.register("pepsite_block", ()-> new BlockItem(block.PEPSITEBLOCK.get(), new Item.Properties()
			.tab(ItemGroup.TAB_BUILDING_BLOCKS)
			.fireResistant()));
	
	public static final RegistryObject<BlockItem> PEPSITEORE = ITEMS.register("pepsite_ore", ()-> new BlockItem(block.PEPSITEORE.get(), new Item.Properties()
			.tab(ItemGroup.TAB_BUILDING_BLOCKS)
			.fireResistant()));

	public static final RegistryObject<Item> PEPSITEINGOT = ITEMS.register("pepsite_ingot", ()-> new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MATERIALS)
			.fireResistant())); 
}

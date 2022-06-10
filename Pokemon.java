package com.nayab.jason;
import java.util.*;
public class Pokemon {
	private int id;
	private String name;
	private int base_experience;
	private int height;
	private boolean is_default;
	private int order;
	private int weight;
	private ArrayList <PokemonAbility> abilities;
	private ArrayList <NamedAPIResource> forms;
	private ArrayList <VersionGameIndex> game_indices;
	private ArrayList <PokemonHeldItem> held_items;
	private String location_area_encounters;
	private ArrayList <PokemonMove> moves;
	private ArrayList <PokemonTypePast> past_types;
	private PokemonSprites sprites;
	private NamedAPIResource species;
	private ArrayList <PokemonStat> stats;
	private ArrayList <PokemonType> types;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBase_experience() {
		return base_experience;
	}
	public void setBase_experience(int base_experience) {
		this.base_experience = base_experience;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public ArrayList<PokemonAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(ArrayList<PokemonAbility> abilities) {
		this.abilities = abilities;
	}
	public ArrayList<NamedAPIResource> getForms() {
		return forms;
	}
	public void setForms(ArrayList<NamedAPIResource> forms) {
		this.forms = forms;
	}
	public ArrayList<VersionGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(ArrayList<VersionGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public ArrayList<PokemonHeldItem> getHeld_items() {
		return held_items;
	}
	public void setHeld_items(ArrayList<PokemonHeldItem> held_items) {
		this.held_items = held_items;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public ArrayList<PokemonMove> getMoves() {
		return moves;
	}
	public void setMoves(ArrayList<PokemonMove> moves) {
		this.moves = moves;
	}
	public ArrayList<PokemonTypePast> getPast_types() {
		return past_types;
	}
	public void setPast_types(ArrayList<PokemonTypePast> past_types) {
		this.past_types = past_types;
	}
	public PokemonSprites getSprites() {
		return sprites;
	}
	public void setSprites(PokemonSprites sprites) {
		this.sprites = sprites;
	}
	public NamedAPIResource getSpecies() {
		return species;
	}
	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}
	public ArrayList<PokemonStat> getStats() {
		return stats;
	}
	public void setStats(ArrayList<PokemonStat> stats) {
		this.stats = stats;
	}
	public ArrayList<PokemonType> getTypes() {
		return types;
	}
	public void setTypes(ArrayList<PokemonType> types) {
		this.types = types;
	}
	
}
